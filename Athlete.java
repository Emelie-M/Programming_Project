import java.util.*;

/**
 * Write a description of class Athlete here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Athlete
{
    private String firstName;
    private String lastName;
    private int YOB;
    private Gender gender;
    private List<Activities> activities = new ArrayList<>();
    
    /**
     * Constructor for objects of class Athlete
     */
    public Athlete(String firstName, String lastName,int YOB, Gender gender)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.YOB = YOB;
        this.gender = gender;
        
    }
    
    public static Athlete createAthlete() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter your first name :");
        String firstName = scanner.nextLine();
        
        System.out.println("Please enter your last name :");
        String lastName = scanner.nextLine();
        
        System.out.println("Please enter your year of birth :");
        int YOB = scanner.nextInt();
        scanner.nextLine();
        
        Gender gender = null;
        while(gender == null){
            System.out.println("Please enter your gender among this list:");
            System.out.println("Male\nFemale\nNon_Binary\nOther");
            try {
                String input = scanner.nextLine().toUpperCase();
                gender = Gender.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid answer, please try again.");
            }
        }
        
        return new Athlete(firstName, lastName, YOB, gender);
    }
    
    public String getName()
    {
        return firstName + " " + lastName;
    }
    
    public int getAge()
    {
        int currentYear = 2025;
        int Age = currentYear - YOB;
        return Age;    
    }
    
    public Gender getGender()
    {
        return gender;
    }
    
    public void addActivity(Activities activity) {
        activities.add(activity);
    }
    
    public List<Activities> getActivities() {
        return activities;
    }
}
