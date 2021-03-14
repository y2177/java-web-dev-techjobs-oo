package org.launchcode.techjobs_oo.Tests;

import org.junit.*;
import static org.junit.Assert.*;  //assertEquals;
import org.launchcode.techjobs_oo.*;

public class JobTest {

    Job testJobOne;
    Job testJobTwo;
    Job testJobThree;

    //Before
    @Before
    public void createJobObject() {
        testJobOne = new Job();
        testJobTwo = new Job();
        testJobThree = new Job("Product tester",new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId() {
        assertEquals(false, testJobOne.equals(testJobTwo));
    }

    //Tests that the constructor correctly assigns the class and value
    //of each field
    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(testJobThree instanceof Job);
        assertEquals("Product tester", testJobThree.getName());
        assertEquals("ACME", testJobThree.getEmployer().getValue());
        assertEquals("Desert", testJobThree.getLocation().getValue());
        assertEquals("Quality control", testJobThree.getPositionType().getValue());
        assertEquals("Persistence", testJobThree.getCoreCompetency().getValue());
    }





}
