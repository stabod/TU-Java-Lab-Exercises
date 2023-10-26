public class App {
    public static void main(String[] args) throws Exception {
        
        Person guy1 = new Person("John", 20);
        guy1.introduce();
        Student guy2 = new Student("Boris", 19, 4.76);
        guy2.introduce();
        guy1.printDetails();
        guy2.printDetails();
        
        Circle cir1 = new Circle(4);

        System.out.println("Circle area: " + cir1.area());
        System.out.println("Circle perimeter: " + cir1.perimeter());

        Rectangle rect1 = new Rectangle(4, 3);
        System.out.println("Rectangle area: " + rect1.area());
        System.out.println("Rectangle perimeter: " + rect1.perimeter());

        Car vroom1 = new Car("Renault", 170, 200, 0);
        //vroom1.drive(10);
        //System.out.println(vroom1.getMileage());
        //System.out.println(vroom1.getFuel());

        ElectricCar vroom2 = new ElectricCar("Tesla", 180, 0, 0, 100, 0.7);
        //vroom2.driveElectric(10);
        //System.out.println(vroom2.getMileage());
        //System.out.println(vroom2.getBatterylevel());

        Car vroom3 = new Car("Peugeot", 180, 250, 0);
        ElectricCar vroom4 = new ElectricCar("Opel", 185, 0, 0, 78, 0.85);

        Car[] myvroomarr = new Car[4];
        myvroomarr[0] = vroom1;
        myvroomarr[1] = vroom2;
        myvroomarr[2] = vroom3;
        myvroomarr[3] = vroom4;

        for(Car c : myvroomarr) {

            System.out.println("Car is " + c.getBrand());

            if (c instanceof ElectricCar) {
                ((ElectricCar) c).driveElectric(5);
            }
            else {
                c.drive(10);
            }
            
        }
    }
}
