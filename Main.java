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
    private Activities activities;
    private Gender gender;

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
      System.out.println("--------------------------------------------------------------");
      System.out.println("1. Add new athlete");
      System.out.println("2. List all athletes");
      System.out.println("3. List all activities");
      System.out.println("4. Add new activity");
      System.out.println("5. Quit");

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
            addActivity();
            break;
        case 5:
            System.out.println("Bye bye :)");
            scanner.close();
            break;
        default : 
            System.out.println("Can't understand, please enter a number");
      }
    }
    
    private void addAthlete(Scanner scanner)
    {
        System.out.println("Please enter your first name :");
        String firstName = scanner.nextLine();
        System.out.println("Please enter your last name :");
        String lastName = scanner.nextLine();
        System.out.println("Please enter your year of birth :");
        int YOB = scanner.nextInt();
        Gender gender = null;
        while(gender == null){
            System.out.println("Please enter your gender among this list:");
            System.out.println("Male\nFemale\nNon_Binary\nOther");
            gender = Gender.toString(scanner.nextLine().toUpperCase());
            if (gender == null){
                System.out.println("Invalid answer, please try again");
            }
        }
    }
    
       public void addActivity()
    {
       Activities a = Activities.createFromUserInput();
       System.out.println("Activity created: " + a.getName() + ", " + a.getMode() + ", " + a.getCaloriesBurned() + " calories");
    }
    public void listAllAthletes()
    {
        // List all register athletes
        // prints all athletes
    }
    
    public void listAllActivities()
    {
        //Gets all activities on the Activities class and prints them
    }
    
    public void listActivitiesByAthlete()
    {
    
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
