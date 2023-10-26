public class ElectricCar extends Car {

    private float maxbattery;
    private float batterylevel;
    private double efficiency;


    public ElectricCar(String brand, float speed, float fuel, float mileage, 
                        float batterylevel, double efficiency) {
        super(brand, speed, fuel, mileage);
        this.maxbattery = 100;
        this.batterylevel = batterylevel;
        this.efficiency = efficiency;

        if(this.batterylevel > 100) {
            this.batterylevel = 100;
        }
        if (this.batterylevel < 0) {
            this.batterylevel = 0;
        }
    }

    public float getBatterylevel() {
        return this.batterylevel;
    }

    public double getEfficiency() {
        return this.efficiency;
    }

    public void charge()
    {
        this.batterylevel = maxbattery;
    }

    public void driveElectric(int distance) {

        if (batterylevel <= 0) {
            System.out.println("No battery!");
            return;
        }
        for (int i = 0; i < distance; i++) {
            this.batterylevel -= (1 * efficiency);
            this.setMileage(this.getMileage() + 1);   
        }
        System.out.println("Drove electric for " + distance);
    }
    
    
}
