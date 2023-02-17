package Model;

import java.text.NumberFormat;

public class EngineRecord {
    private Integer numCylinders;
    private Float displacment;
    private Float taxes;

    public EngineRecord(Integer numCylinders, Float displacment, Float taxes) {
        this.numCylinders = numCylinders;
        this.displacment = displacment;
        this.taxes = taxes;
    }

    @Override
    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return "{" + numCylinders + " " + displacment + " " + formatter.format(taxes) + "}";
    }
}
