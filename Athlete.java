import java.util.*;

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
        /*String name = name;
        int age = age;
        double weight = weight;*/
        
    }
    
    public String getName(String firstName, String lastName)
    {
        return firstName + lastName;
    }
    
    public int getAge(int yearOfBirth)
    {
        int currentYear = 2025;
        int Age = currentYear - yearOfBirth;
        return Age;    
    }
    
    /*public String getGender()
    {
        
    }*/
    
    public void getUsername()
    {
    
    }
}
