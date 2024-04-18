package io.zipcoder.interfaces;

import Interfaces.Learner;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent
{
    @Test
    public void testImplementation()
    {
        Student test = new Student(2, "Ela", 10.0);
        Assert.assertTrue(test instanceof Learner);
    }
    @Test
    public void testInheritance()
    {
        Student test = new Student(2, "Ela", 10.0);
        Assert.assertTrue(test instanceof Person);
    }
    @Test
    public void testLearn()
    {
        Student test = new Student(2, "Ela", 10.0);
        test.learn(10);
        Assert.assertEquals(new Double(20.0), test.getTotalStudyTime());
    }
}
