package study.viradonojiraya.day5.finalModifier.domain;

// we can even use "final" at the class name (like public final class Car)
// it prevents the class from being extended (other classes can't extend this class)
// one example is the String class
public class Car {
    // the "final" modifier can be used in a lot of examples like the singleton design pattern, where you
    // want just one instance of some object and don't want the instance to be modified by subclasses

    private String brand;
    // we can define final attributes as public, once it can't be modified anyway
    public static final double LIMIT_SPEED = 250; // it does not need to be static
    public static final String COUNTRY;
    public final Buyer BUYER = new Buyer();

    // we can initialize final attributes inside static block initiator
    static {
        COUNTRY = "USA";
    }

    public Buyer getBUYER() {
        return BUYER;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
