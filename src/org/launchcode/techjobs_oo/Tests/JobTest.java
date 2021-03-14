package org.launchcode.techjobs_oo.Tests;

import org.junit.*;
import static org.junit.Assert.*;  //assertEquals;
import org.launchcode.techjobs_oo.*;

public class JobTest {

    Job testJobOne, testJobTwo, testJobThree;
    Job testJobFour, testJobFive, testJobSix;
    Job testJobSeven, testJobEight, testJobNine;
    Job testJobTen, testJobEleven;

    //Before
    @Before
    public void createJobObject() {
        testJobOne = new Job();
        testJobTwo = new Job();
        testJobThree = new Job("Product tester",new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        testJobFour = new Job();
        testJobFive = new Job();
        testJobSix = new Job("Software Engineer", new Employer("Armadyne"),
                new Location("Los Angeles"), new PositionType("Factory Automation"),
                new CoreCompetency("C++"));
        testJobSeven = new Job(null, new Employer("Armadyne"),
                new Location("Los Angeles"), new PositionType("Factory Automation"),
                new CoreCompetency("C++"));
        testJobEight = new Job("Software Engineer", null,
                new Location("Los Angeles"), new PositionType("Factory Automation"),
                new CoreCompetency("C++"));
        testJobNine = new Job("Software Engineer", new Employer("Armadyne"),
                null, new PositionType("Factory Automation"),
                new CoreCompetency("C++"));
        testJobTen = new Job("Software Engineer", new Employer("Armadyne"),
                new Location("Los Angeles"), null,
                new CoreCompetency("C++"));
        testJobEleven = new Job("Software Engineer", new Employer("Armadyne"),
                new Location("Los Angeles"), new PositionType("Factory Automation"),
                null);

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
        assertEquals(3, testJobThree.getId());
        assertEquals("Product tester", testJobThree.getName());
        assertEquals("ACME", testJobThree.getEmployer().getValue());
        assertEquals("Desert", testJobThree.getLocation().getValue());
        assertEquals("Quality control", testJobThree.getPositionType().getValue());
        assertEquals("Persistence", testJobThree.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(testJobFour.equals(testJobFive));
    }


    @Test
    public void toStringTest() {
        String dataNotAvailable = "Data not available";

        assertEquals("\n" + "\n",
                testJobSix.toString().substring(0, 1) +
                        testJobSix.toString().substring(testJobSix.toString().length() - 1));

        assertEquals("\nID: " + testJobSix.getId() +
                            "\nName: " + testJobSix.getName() +
                            "\nEmployer: " + testJobSix.getEmployer() +
                            "\nLocation: " + testJobSix.getLocation() +
                            "\nPosition Type: " + testJobSix.getPositionType() +
                            "\nCore Competency: " + testJobSix.getCoreCompetency() +
                            "\n", testJobSix.toString());

        assertTrue(testJobSeven.toString().contains("Name: Data not available"));

        assertTrue(testJobEight.toString().contains("Employer: Data not available"));

        assertTrue(testJobNine.toString().contains("Location: Data not available"));

        assertTrue(testJobTen.toString().contains("Position Type: Data not available"));

        assertTrue(testJobEleven.toString().contains("Core Competency: Data not available"));

    }
}
