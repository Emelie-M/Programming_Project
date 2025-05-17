import java.util.*;

/**
 * Main class used to run the program and start the Strava like program
 *
 */
public class Main
{
    private Athlete athlete;
    private Activities activitie;
    List<Athlete> athletes = new ArrayList<>(); 
    List<Activities> activities = new ArrayList<>();
  
    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        
    }
    
    /**
     * runs the main class
     * This method is used to start
     */
     
    public void start()
    {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Welcome! This is an app like Strava\nwhere you can log your activities.");
        // Register equipment at the start
        Equipment.register("Bike");
        Equipment.register("E_Bike");
        Equipment.register("Rollerblade");
        Equipment.register("Treadmill");
        Equipment.register("Elliptical");
        Equipment.register("Soccer Ball");

        boolean running = true;
      
      while (running) {
          System.out.println("--------------------------------------------------------------");
          System.out.println("1. Add new athlete");
          System.out.println("2. List all athletes");
          System.out.println("3. List all activities");
          System.out.println("4. Add new activity");
          System.out.println("5. List activities by athlete");
          System.out.println("6. Get total distance by athlete");
          System.out.println("7. Quit");
          System.out.println("--------------------------------------------------------------");
    
          int choice = scanner.nextInt();
          scanner.nextLine(); 
    
           switch(choice)
           {
            case 1:
                addAthlete(scanner);
                break;
            case 2: 
                listAllAthletes();
                break;
            case 3:
                listAllActivities();
                break;
            case 4:
                addActivity(scanner);
                break;
            case 5:
                listActivitiesByAthlete(scanner);
                break;
            case 6:
                getDistanceByAthlete();
                break;
            case 7:
                System.out.println("Bye bye :)");
                running = false;
                break;
            default : 
                System.out.println("Can't understand, please enter a number");
          }
      }
      scanner.close();
    }
    
    /**
     * calls createAthlete method from the Athlete class & prints out the returns
     * This method is used to addathlete
     */
    private void addAthlete(Scanner scanner)
    {
        Athlete athlete = Athlete.createAthlete();
        athletes.add(athlete);
        
        System.out.println("Athlete created: ");
        System.out.println("Athlete's Full Name: " + athlete.getName());
        System.out.println("Athlete's Age: " + athlete.getAge());
        System.out.println("Athlete's Gender: " + athlete.getGender());
    }

    /**
     *This method is used to add an activity. 
     */
    public void addActivity(Scanner scanner)
    {
        System.out.println("Enter the full name of the athlete:");
        String nameInput = scanner.nextLine();
        Athlete selectedAthlete = null;

        for (Athlete athlete : athletes) {
            if (athlete.getName().equalsIgnoreCase(nameInput)) {
                selectedAthlete = athlete;
                break;
            }
        }

        if (selectedAthlete == null) {
            System.out.println("Athlete not found.");
            return;
        }

        System.out.print("Is this a powered activity (requires equipment)? (yes/no): ");
        String isPowered = scanner.nextLine().trim().toLowerCase();

        if (isPowered.equals("yes")) {
            Activities base = Activities.createFromUserInput();
            Equipment equipment = Equipment.selectEquipmentFromUser();
            PoweredActivities pa = new PoweredActivities(
                    base.getName(),
                    base.getDistance(),
                    base.getDuration(),
                    base.getMode(),
                    base.getAthleteWeight(),
                    base.getDescription(),
                    equipment
            );
            selectedAthlete.addActivity(pa);
            System.out.printf("Powered activity created: %s, %s, %.2f cal, Equipment: %s%n", pa.getName(), pa.getMode(), pa.getCaloriesBurned(), equipment.getName());

        } else {
            Activities a = Activities.createFromUserInput();
            selectedAthlete.addActivity(a);
            System.out.printf("Activity created: %s, %s, %.2f calories%n", a.getName(), a.getMode(), a.getCaloriesBurned());
        }
    }

    /**
     * prints all athletes registered
     * This method is used to list all athletes.
     */
    public void listAllAthletes()
    {
        System.out.println("List of Athletes:");
        for (Athlete athlete : athletes) {
            System.out.println(athlete.getName());
        }
    }

    /**
     * prints all activities registered by all athletes
     */
    public void listAllActivities()
    {
        System.out.println("List of All Activities:");
        for (Athlete athlete : athletes) {
            for (Activities activity : athlete.getActivities()) {
                if (activity instanceof PoweredActivities) {
                    PoweredActivities pa = (PoweredActivities) activity;
                    System.out.printf("- %s by %s (%s, %.2f cal, Equipment: %s)%n",
                            pa.getName(), athlete.getName(), pa.getMode(),
                            pa.getCaloriesBurned(), pa.getEquipment().getName());
                } else {
                    System.out.printf("- %s by %s (%s, %.2f cal)%n",
                            activity.getName(), athlete.getName(), activity.getMode(),
                            activity.getCaloriesBurned());
                }
            }
        }
    }

    /**
     * prints the activities the athlete registered
     */
    public void listActivitiesByAthlete(Scanner scanner)
    {
        System.out.println("Enter the athlete's full name:");
        String nameInput = scanner.nextLine().trim();
    
        for (Athlete athlete : athletes) {
            if (athlete.getName().equalsIgnoreCase(nameInput)) {
                System.out.println("Activities for " + athlete.getName() + ":");
                for (Activities a : athlete.getActivities()) {
                    System.out.println("- " + a.getName() + " (" + a.getMode() + ", " + a.getCaloriesBurned() + " cal)");
                }
                return;
            }
        }
     }
    
    /**
     * This method is used to get distance by athlete.
     */
    
     public void getDistanceByAthlete()
    {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the athlete's full name:");
      String nameInput = scanner.nextLine().trim();

      for (Athlete athlete : athletes) {
        if (athlete.getName().equalsIgnoreCase(nameInput)) {
            double totalDistance = 0.0;
            for (Activities a : athlete.getActivities()) {
                totalDistance += a.getDistance();
            }
            System.out.println("Total distance by " + athlete.getName() + ": " + totalDistance + " km");
            return;
        }
      }
      System.out.println("Athlete not found.");
    } 
    
    /**
     * used to start the program
     */
     public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }
}
