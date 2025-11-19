package sprint3Tasca_S301Nivel3.vehicle;

public class Ship implements Vehicle{
    private final String name;

    public Ship(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println(this.name + " has been started");
    }

    @Override
    public void accelerate() {
        System.out.println(this.name + " has been accelerated");
    }

    @Override
    public void brake() {
        System.out.println(this.name + " has been braked");
    }
}
