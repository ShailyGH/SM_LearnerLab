package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson
{
    @Test
   public void testConstructor()
    {
        Person person = new Person(2, "Ela");
        Assert.assertEquals(person.getId(), 2);
        Assert.assertEquals(person.getName(),  "Ela");
    }
    @Test
    public void testSetName()
    {
        Person person = new Person(2, "Ela");
        person.setName("Jai");
        Assert.assertEquals(person.getName(),  "Jai");
    }
}
