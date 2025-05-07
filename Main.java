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
        System.out.println("Welcome! This is an app like Strava\n where you could log your activies.");
        System.out.println("--------------------------------------------------------------");
        System.out.println("1. Add new athlete\n2. List all athletes\n3. List all activities\n4. Quit");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch(choice)
        {
            case 1:
                addAthlete(scanner);
                break;
            case 2: 
                break;
            case 3:
                break;
            case 4:
                System.out.println("Bye bye :)");
                scanner.close();
                break;
            default : 
                System.out.println("Can't understand, please enter a number");
        }
    }
    
    public void addAthlete(Scanner scanner)
    {
        System.out.println("Please enter your first name :");
        String firstName = scanner.nextLine();
        System.out.println("Please enter your last name :");
        String lastName = scanner.nextLine();
        System.out.println("Please enter your year of birth :");
        int YOB = scanner.nextInt();
        System.out.println("Please enter your gender among this list:");
        System.out.println("Male\nFemale\nNon_Binary\nOther");
        String input = scanner.nextLine().toUpperCase();
        Gender gender = Gender.valueOf(input);
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
}
