package Model;

import java.text.NumberFormat;

public class Car {

    //
    // Data members
    //

    private Integer id;
    private String make;
    private String model;
    private Float price;
    private Engine engine;

    //
    // Constructors
    //

    public Car(Integer id, String make, String model, Float price) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.price =  price;
    }

    public Car(Integer id, String make, String model, Float price, Engine engine) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.price = price;
        this.engine = engine;
    }

    //
    // Methods
    //

    public Integer getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Float getPrice() {
        return price;
    }

    //
    // Setters
    //

    public void setPrice(Float price) {
        this.price = price;
    }

    //
    // Getters
    //

    public Engine getEngine() {
        return engine;
    }

    //
    // Overrides
    //

    @Override
    public String toString() {
        return "{" + id + ": " + make + " " + model + " " + price + "}";
    }
}
