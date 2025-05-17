

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ActivitiesTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ActivitiesTest
{
    /**
     * Default constructor for test class ActivitiesTest
     */
    public ActivitiesTest()
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
    public void creatingActivity()
    {
        Activities activiti1 = new Activities("Running with friends", 5, 2, Modality.RUNNING, 80, "Love running with some friends");
        assertEquals(80, activiti1.getAthleteWeight(), 0.1);
        assertEquals("Love running with some friends", activiti1.getDescription());
        assertEquals(5, activiti1.getDistance(), 0.1);
        assertEquals(2, activiti1.getDuration(), 0.1);
        assertEquals(Modality.RUNNING, activiti1.getMode());
        assertEquals("Running with friends", activiti1.getName());
        assertEquals(1568, activiti1.getCaloriesBurned(), 0.1);
    }
}

