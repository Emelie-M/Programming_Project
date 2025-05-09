import java.util.*;

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
    
    public void Start()
    {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Welcome! This is an app like Strava\nwhere you can log your activities.");
      boolean running = true;
      
      while (running) {
          System.out.println("--------------------------------------------------------------");
          System.out.println("1. Add new athlete");
          System.out.println("2. List all athletes");
          System.out.println("3. List all activities");
          System.out.println("4. Add new activity");
          System.out.println("5. List activities by athlete");
          System.out.println("6. Quit");
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
                System.out.println("Bye bye :)");
                running = false;
                break;
            default : 
                System.out.println("Can't understand, please enter a number");
          }
      }
      scanner.close();
    }
    
    private void addAthlete(Scanner scanner)
    {
        Athlete athlete = Athlete.createAthlete();
        athletes.add(athlete);
        
        System.out.println("Athlete created: ");
        System.out.println("Athlete's Full Name: " + athlete.getName());
        System.out.println("Athlete's Age: " + athlete.getAge());
        System.out.println("Athlete's Gender: " + athlete.getGender());
    }
    
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
    
      Activities a = Activities.createFromUserInput();
      selectedAthlete.addActivity(a);
      System.out.println("Activity created: " + a.getName() + ", " + a.getMode() + ", " + a.getCaloriesBurned() + " calories");
    }

    public void listAllAthletes()
    {
        System.out.println("List of Athletes:");
        for (Athlete athlete : athletes) {
            System.out.println(athlete.getName());
        }
    }
    
    public void listAllActivities()
    {
        //Gets all activities on the Activities class and prints them
    }
    
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
    
    public void listActivitiesByMode()
    {
    
    }
    
    public void getDistanceByAthlete()
    {
        
    }
    
     public static void main(String[] args) {
        Main app = new Main();
        app.Start();
    }
}
