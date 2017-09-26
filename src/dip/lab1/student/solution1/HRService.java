package dip.lab1.student.solution1;

/**
 * A high-level class that delegates to employee objects to do the work.
 *
 * @author mjmersenski
 */
public class HRService {

    public double getAnnualCompensationForEmployee(Employee e) {
        if(e == null){
            throw new IllegalArgumentException("employee is mandatory");
        }
        return e.getAnnualWages();
    }
}
