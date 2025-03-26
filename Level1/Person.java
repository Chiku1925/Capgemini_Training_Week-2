 public class Person{
 String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


    public static void main(String[] args) {
        Person original = new Person("John", 25);
        System.out.println("Original Person Details:");
        original.displayDetails();

        System.out.println();

        Person copied = new Person(original);
        System.out.println("Copied Person Details:");
        copied.displayDetails();
    }
}