package Model;

import java.text.NumberFormat;
import java.util.Locale;

public class CarRecord {
    private Integer Id;
    private String make;
    private String model;
    private String price;

    public CarRecord(Integer id, String make, String model, String price) {
        Id = id;
        this.make = make;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        return "{" + Id + " " + make + " " + model + " " + formatter.format(Float.valueOf(price)) + "}";
    }
}
