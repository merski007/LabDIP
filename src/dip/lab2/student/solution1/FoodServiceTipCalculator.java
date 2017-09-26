package dip.lab2.student.solution1;

/**
 *
 * @author mjmersenski
 */
public class FoodServiceTipCalculator {

    private double billAmt;
    private double tipPercent;

    public FoodServiceTipCalculator(double billAmt, double tipPercent) {
        setBillAmt(billAmt);
        setTipPercent(tipPercent);
    }

    public final double getTip() {
        return billAmt * tipPercent;
    }

    public final double getBillAmt() {
        return billAmt;
    }

    public final void setBillAmt(double billAmt) {
        if (billAmt <= 0) {
            throw new IllegalArgumentException("Bill amount cannot be zero");
        }
        this.billAmt = billAmt;
    }

    public final double getTipPercent() {
        return tipPercent;
    }

    public final void setTipPercent(double tipPercent) {
        if (billAmt <= 0) {
            throw new IllegalArgumentException("Tip percent amount cannot be zero");
        }
        this.tipPercent = tipPercent;
    }

}
