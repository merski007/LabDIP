package dip.lab2.student.solution1;

/**
 *
 * @author mjmersenski
 */
public class BaggageServiceTipCalculator implements TipCalculator {
    private double baseTipPerBag;
    private int bagCount;
    private double tipPercent;

    public BaggageServiceTipCalculator(double baseTipPerBag, int bagCount, double tipPercent) {
        this.setBaseTipPerBag(baseTipPerBag);
        this.setBagCount(bagCount);
        this.setTipPercent(tipPercent);
    }
    
    public final double getTip(){
        return (bagCount * baseTipPerBag) * (1 + tipPercent);
    }

    public final double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public final void setBaseTipPerBag(double baseTipPerBag) {
        if (baseTipPerBag <= 0) {
            throw new IllegalArgumentException("Base tip cannot be zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

    public final int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if (bagCount <= 0 ||bagCount >= 50) {
            throw new IllegalArgumentException("Bag count must be greater then 0 and less then 50");
        }
        this.bagCount = bagCount;
    }

    public final double getTipPercent() {
        return tipPercent;
    }

    public final void setTipPercent(double tipPercent) {
        if (tipPercent <= 0) {
            throw new IllegalArgumentException("Tip percent cannot be zero");
        }
        this.tipPercent = tipPercent;
    }
    
    
    
}
