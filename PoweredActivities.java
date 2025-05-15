
public class PoweredActivities extends Activities
{
    private Equipment equipment;


    public PoweredActivities(String name, double distance, double duration, Modality mode, double athleteWeight, String description, Equipment equipment)
    {
        super(name, distance, duration, mode, athleteWeight, description);
        this.equipment = equipment;
    }
    
    /**
     *  This method is used to get equipment.
     */
    public Equipment getEquipment()
    {
        return equipment;
    }
    
    /**
     *  This method is used to tostring.
     */
    @Override
    public String toString()
    {
        return String.format("%s [%s] — equipment: %s", getName(), getMode(), equipment.getName());
    }
}
