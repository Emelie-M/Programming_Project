
/**
 * Write a description of class Activities here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Activities
{
    private String  name;        // e.g. “Morning Spin”
    private double  distance;    // in kilometers
    private double  duration;    // in hours
    private Modality mode;       // one of your enum values
    private double  athleteWeight; // in kilograms
    private String  description; // free-form text
    /**
     * Constructor for objects of class Activities
     */
    public Activities(String name,double distance,double duration,Modality mode,double athleteWeight,String description)
    {
        this.name          = name;
        this.distance      = distance;
        this.duration      = duration;
        this.mode          = mode;
        this.athleteWeight = athleteWeight;
        this.description   = description;
    }
     
     public String   getName()        { 
         return name;        
    }
    public double getDistance()
    {
        return distance;
    }
    
    public double getDuration()
    {
        return duration;
    }
    
    public Modality getMode() 
    {
       return mode;
    }
    
    public double getAthleteWeight()
    {
       return athleteWeight;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public double getCaloriesBurned()
    {
       double met;
        switch (mode) {
            case RUNNING:      met = 9.8; break;
            case SWIMMING:      met = 8.0; break;
            case CYCLING:       met = 7.5; break;
            case WEIGHTLIFTING: met = 6.0; break;
            case ROLLERBLADE:   met = 7.0; break;
            default:            met = 1.0; break;
        }
        return met * athleteWeight * duration;
    }
}
