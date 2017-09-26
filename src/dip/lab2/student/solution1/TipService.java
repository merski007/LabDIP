package dip.lab2.student.solution1;

/**
 *
 * @author mjmersenski
 */
public class TipService {
    private TipCalculator calc;

    public TipService(TipCalculator calc) {
        setCalc(calc);
    }

    public TipCalculator getCalc() {
        return calc;
    }

    public void setCalc(TipCalculator calc) {
        if (calc == null) {
            throw new NullPointerException("Parameter Type cannot be null");
        }
        this.calc = calc;
    }
    
    
    
    
}
