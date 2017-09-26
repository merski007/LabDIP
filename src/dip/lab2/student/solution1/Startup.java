package dip.lab2.student.solution1;

/**
 *
 * @author mjmersenski
 */
public class Startup {
    public static void main(String[] args) {
        TipCalculator calc = new BaggageServiceTipCalculator(1.0,2,.2);
        //TipCalculator calc = new FoodServiceTipCalculator(100,.2);
        
        TipService amt = new TipService(calc);
        
        System.out.println(amt.getTip());
    }
}
