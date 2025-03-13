package ex02;

public class Car {

    private static final String brand = "ford";
    private static String model = "f-100";
    private final Integer potency;

    public Car(Integer p_potency) {
        this.potency = p_potency;
    }

    public void accelerate() {
        System.out.println("The car is accelarating.");
    }

    public static void stop() {
        System.out.println("The car has stopped.");
    }
}
