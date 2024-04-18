package io.zipcoder.interfaces;

import Interfaces.Learner;
import Interfaces.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor
{
    @Test
    public void testImplementation()
    {
        Instructor test = new Instructor(2, "Ela");
        Assert.assertTrue(test instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor test = new Instructor(2, "Ela");
        Assert.assertTrue(test instanceof Person);
    }

    @Test
    public void testTeach() {
        Instructor test = new Instructor(2, "Ela");
        Student testStud = new Student(1, "Jai", 10.0);
        double numberOfHours = 10.0;
        test.teach(testStud, numberOfHours);
        double expected = 20.0;
        double actual = testStud.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.05);
    }

    @Test
    public void testLecture() {
        Instructor test = new Instructor(2, "Ela");
        double numberOfHours = 10.0;
        Learner[] students = new Learner[4];
        students[0] = new Student(1, "Jai", 10.0);
        students[1] = new Student(2, "Jay", 10.0);
        students[2] = new Student(3, "Nikita", 10.0);
        students[3] = new Student(4, "Mary", 10.0);
        test.lecture(students, numberOfHours);
        double expected = numberOfHours + (numberOfHours / students.length);
        double actualA = students[0].getTotalStudyTime();
        double actualB = students[1].getTotalStudyTime();
        double actualC = students[2].getTotalStudyTime();
        double actualD = students[3].getTotalStudyTime();
        Assert.assertEquals(expected, actualA, 0.05);
        Assert.assertEquals(expected, actualB, 0.05);
        Assert.assertEquals(expected, actualC, 0.05);
        Assert.assertEquals(expected, actualD, 0.05);
    }
}
