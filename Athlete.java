import java.util.HashMap;

/**
 * Write a description of class Athlete here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Athlete
{

    /**
     * Constructor for objects of class Athlete
     */
    public Athlete()
    {
        
    }

    public String getName(String firstName, String lastName)
    {
        return firstName + lastName;
    }
    
    public int getAge(int day, int month, int year)
    {
        int currentYear = 2025;
        int Age = currentYear - year;
        return Age;    
    }
    
    public void getGender()
    {
    
    }
    
    public void getUsername()
    {
    
    }
}
