package io.zipcoder.interfaces;

import Interfaces.Learner;

public class Student extends Person implements Learner {
   private Double totalStudyTime;

    public Student(long id, String name, Double totalStudyTime) {
        super(id, name);
        this.totalStudyTime = totalStudyTime;
    }
    @Override
    public void learn(double numberOfHours)
    {
        totalStudyTime += numberOfHours;
    }
    @Override
    public Double getTotalStudyTime()
    {
        return totalStudyTime;
    }
}

