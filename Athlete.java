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
    private int DOB;
    private double weight;
    private String Gender;
    
    
    /**
     * Constructor for objects of class Athlete
     */
    public Athlete(String firstName, String lastName,int DOB, double weight)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.weight = weight;
        setGender();
        
    }
    
    public String getName()
    {
        return firstName + " " + lastName;
    }
    
    public int getAge()
    {
        int currentYear = 2025;
        int Age = currentYear - DOB;
        return Age;    
    }
    
    public void setGender()
    {
        Scanner inputGender = new Scanner(System.in);
        for (gender Gender : gender.values())
        {
            System.out.println(Gender);
        }
        System.out.print("Please enter your Gender from the list above : ");
        String userGender = inputGender.nextLine();
        Gender = userGender;
    }
    
    public String getGender()
    {
        return Gender;
    }
    
    public String getUsername()
    {
        String username = firstName + lastName + DOB;
        return username;
    }
}
