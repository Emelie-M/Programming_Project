
import java.util.Scanner;
/**
 * This class is used to create a new activity for a specific athlete calculating his or her 
 * calories burned distance logged.
 * 
 * 
 * 
 */
public class Activities
{
    private String name;          // e.g. “Morning Spin”
    private double distance;      // in kilometers
    private double duration;      // in hours
    private Modality mode;        // one of your enum values
    private double athleteWeight; // in kilograms
    private String description;   // free-form text

    
    public Activities(String name, double distance, double duration, Modality mode, double athleteWeight, String description)
    {
        this.name = name;
        this.distance = distance;
        this.duration = duration;
        this.mode = mode;
        this.athleteWeight = athleteWeight;
        this.description = description;
    }

    /**
     * User is prompted to input information about the activity they are adding
     */
    
    public static Activities createFromUserInput()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the activity name: ");
        String name = input.nextLine();

        System.out.print("Enter the distance (in km): ");
        double distance = input.nextDouble();

        System.out.print("Enter the duration (in hours): ");
        double duration = input.nextDouble();

        input.nextLine(); 

        System.out.println("Select the modality:");
        for (Modality m : Modality.values())
        {
            System.out.println("- " + m);
        }
        System.out.print("Your choice: ");
        String modeStr = input.nextLine().toUpperCase();

        Modality mode;
        try {
            mode = Modality.valueOf(modeStr);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input. Defaulting to RUNNING.");
            mode = Modality.RUNNING;
        }

        System.out.print("Enter athlete weight (in kg): ");
        double weight = input.nextDouble();

        input.nextLine(); 

        System.out.print("Enter a description: ");
        String description = input.nextLine();

        return new Activities(name, distance, duration, mode, weight, description);
    }

    /**
     * title of activity
     */
    public String getName() {
        return name;
    }

    /**
     * distance of activity(input 0 if activity doesnt require a distance)
     */
    public double getDistance() {
        return distance;
    }

    /**
     * distance of activity
     */
    public double getDuration() {
        return duration;
    }

    /**
     * type of activity that the user will be prompted with to choose
     */
    public Modality getMode() {
        return mode;
    }

    /**
     * gets the athletes weight
     */
    public double getAthleteWeight() {
        return athleteWeight;
    }

    /**
     * user inputs a description of the activity they created
     */
    public String getDescription() {
        return description;
    }

    /**
     * calculates the calories burned by modality
     */
    public double getCaloriesBurned()
    {
        double met;
        switch (mode) {
            case RUNNING:      met = 9.8; break;
            case SWIMMING:     met = 8.0; break;
            case CYCLING:      met = 7.5; break;
            case WEIGHTLIFTING:met = 6.0; break;
            case ROLLERBLADE:  met = 7.0; break;
            default:           met = 1.0; break;
        }
        return met * athleteWeight * duration;
    }
}
