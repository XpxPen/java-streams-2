package Model;

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
        return "{" + Id + " " + make + " " + model + " " + price + "}";
    }
}

