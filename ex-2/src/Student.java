public class Student extends Person {

    private double grade;


    public Student(String name, int age, double grade) {
        super(name, age);
        this.grade = grade;
    }


    public double getGrade() {
        return this.grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + this.getName() + ", I am " + this.getAge() + " years old and my grade is " + this.grade);
    }

    public void printDetails()
    {
        System.out.println("Student Details:");
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Grade: " + this.grade);
    }

    
    
}
