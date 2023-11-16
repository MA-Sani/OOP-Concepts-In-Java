public class Car {
    // Fields
    String make;
    String model;
    int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method
    public void start() {
        System.out.println("The car is starting.");
    }
}

// Creating an object of the Car class
Car myCar = new Car("Toyota", "Camry", 2022);
