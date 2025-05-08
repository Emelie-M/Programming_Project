
/**
 * Enumeration class Gender - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Gender
{
    MALE,
    FEMALE,
    NON_BINARY,
    OTHER;
    
    public static Gender toString(String input)
    {
        return Gender.valueOf(input.toUpperCase());
    }
}
