

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class AthleteTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AthleteTest
{
    /**
     * Default constructor for test class AthleteTest
     */
    public AthleteTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }


    @Test
    public void addingAthlete()
    {
        Athlete athlete1 = new Athlete("John", "Doe", 2006, Gender.MALE);
        assertEquals(19, athlete1.getAge());
        assertEquals(Gender.MALE, athlete1.getGender());
        assertEquals("John Doe", athlete1.getName());
    }
}


