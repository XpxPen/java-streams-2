package Model;

public class Engine {

    //
    // Data members
    //

    private final Float displacement;
    private final Integer numCylinders;

    //
    // Constructors
    //

    public Engine(Float displacment, Integer numCylinders) {
        this.displacement = displacment;
        this.numCylinders = numCylinders;
    }

    //
    // Methods
    //

    public Float getDisplacment() {
        return displacement;
    }

    public Integer getNumCylinders() {
        return numCylinders;
    }

    //
    // Overrides
    //

    @Override
    public String toString() {
        return "{" + displacement + " " + numCylinders + "}";
    }
}
