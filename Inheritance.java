public class ElectricCar extends Car {
    // Additional fields specific to ElectricCar
    int batteryCapacity;

    // Constructor for ElectricCar
    public ElectricCar(String make, String model, int year, int batteryCapacity) {
        super(make, model, year); // Call the constructor of the superclass (Car)
        this.batteryCapacity = batteryCapacity;
    }

    // Additional method for ElectricCar
    public void charge() {
        System.out.println("Charging the electric car.");
    }
}
