public class Person implements Printable{
    
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + this.name + " and I am " + this.age + " years old");
    }

    public void printDetails() {
        System.out.println("Person Details:");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }



}
