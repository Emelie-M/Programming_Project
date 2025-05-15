import java.util.*;

/**
 * Represents a piece of equipment used in activities (e.g., Bike, Rollerblade).
 */
public class Equipment {
    private String name;

    // Static list to track all registered equipment
    private static List<Equipment> registeredEquipment = new ArrayList<>();

    // Constructor
    public Equipment(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Register a new piece of equipment
    public static void register(String name) {
        registeredEquipment.add(new Equipment(name));
    }

    // Show all registered equipment
    public static void listAllRegistered() {
        System.out.println("Available Equipment:");
        for (Equipment e : registeredEquipment) {
            System.out.println("- " + e.getName());
        }
    }

    // Prompt user to select equipment from registered list
    public static Equipment selectEquipmentFromUser() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            listAllRegistered();
            System.out.print("Select equipment by name: ");
            String input = scanner.nextLine().trim();

            for (Equipment e : registeredEquipment) {
                if (e.getName().equalsIgnoreCase(input)) {
                    return e;
                }
            }

            System.out.println("Invalid input. Please try again.");
        }
    }
    // This method is used to tostring.
    @Override
    public String toString() {
        return name;
    }
}

