public class AnimalHeirarchy{
static class Animal{
    public String name;
    public int age;
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }

    void makeSound(){
        System.out.println(" Animal name and Sound:");
    }
}

static class Dog extends Animal{
    public Dog(String name, int age){
        super(name, age);
    }
    @Override
    void makeSound(){
        System.out.println(name+" bark");
    }



}
static class Cat extends Animal{
    public Cat(String name, int age){
        super(name, age);
    }
    @Override
    void makeSound(){
        System.out.println(name+" Meow");
    }



}
static class Bird extends Animal{
    public Bird(String name, int age){
        super(name, age);
    }
    @Override
    void makeSound(){
        System.out.println(name+" Chirp");
    }



}

    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy", 3);
        Animal myCat = new Cat("Whiskers", 2);
        Animal myBird = new Bird("Tweety", 1);

        myDog.makeSound();  
        myCat.makeSound();  
        myBird.makeSound(); 
    }
}
