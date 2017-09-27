package dip.lab1.student.solution1;

import dip.lab1.*;

/**
 * The concrete super class of all employee types. What's wrong with this class?
 * Find and fix all encapsulation, DIP and best practice problems learned
 * so far.
 *
 * @author your name goes here
 */
public abstract class Employee {
    /**
     * annualWages and annualSalary are the same thing (DIP repetitive task)
     */
    
    /**
     * Returns annual wages for hourly workers. Is this polymorphic?
     * Could it be? Does it belong here?
     *
     * @return annual wages for hourly workers using the formula
     * annualWages = hourlyRate * totalHrsForYear
     */
    public abstract double getAnnualWages();

}
