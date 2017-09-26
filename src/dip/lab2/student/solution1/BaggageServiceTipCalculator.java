package dip.lab2.student.solution1;

/**
 *
 * @author mjmersenski
 */
public class BaggageServiceTipCalculator {
    private double baseTipPerBag;
    private int bagCount;
    private double tipPercent;

    public BaggageServiceTipCalculator(double baseTipPerBag, int bagCount, double tipPercent) {
        this.baseTipPerBag = baseTipPerBag;
        this.bagCount = bagCount;
        this.tipPercent = tipPercent;
    }
    
    public final double getTip(){
        return (bagCount * baseTipPerBag) * (1 + tipPercent);
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if (baseTipPerBag <= 0) {
            throw new IllegalArgumentException("Base tip cannot be zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

    public int getBagCount() {
        return bagCount;
    }

    public void setBagCount(int bagCount) {
        if (bagCount <= 0 ||bagCount >= 50) {
            throw new IllegalArgumentException("Bag count must be greater then 0 and less then 50");
        }
        this.bagCount = bagCount;
    }

    public double getTipPercent() {
        return tipPercent;
    }

    public void setTipPercent(double tipPercent) {
        if (tipPercent <= 0) {
            throw new IllegalArgumentException("Tip percent cannot be zero");
        }
        this.tipPercent = tipPercent;
    }
    
    
    
}
