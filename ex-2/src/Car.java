public class Car {
    
    private String brand;
    private float speed;
    private float fuel;
    private float maxfuel;
    private float mileage;
    

    public Car(String brand, float speed, float fuel, float mileage) {
        this.brand = brand;
        this.speed = speed;
        this.fuel = fuel;
        this.maxfuel = fuel;
        this.mileage = mileage;
    }


    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getSpeed() {
        return this.speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getFuel() {
        return this.fuel;
    }

    public void setFuel(float fuel) {
        this.fuel = fuel;
    }

    public float getMaxfuel() {
        return this.maxfuel;
    }

    public void setMaxfuel(float maxfuel) {
        this.maxfuel = maxfuel;
    }

    public float getMileage() {
        return this.mileage;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }


    public void accelerate() {
        this.speed += 10;
    }

    public void brake() {
        this.speed -= 10;
    }

    public void refuel() {
        this.fuel = this.maxfuel;
    }

    void drive(int distance) {

        if (fuel <= 0) {
            System.out.println("No fuel!");
            return;
        }
        for (int i = 0; i < distance; i++) {
            this.fuel -= 0.1;
            this.mileage += 1;   
        }
        System.out.println("Drove for " + distance);
    }



}
