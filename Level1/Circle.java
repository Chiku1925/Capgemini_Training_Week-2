public class Circle{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public void displayResults(){
        double area=(Math.PI)*(Math.pow(radius, 2));
        System.out.println("The Area of the Circle is : "+ area);
        double circum=2*(Math.PI)*radius;
        System.out.println("The Circumference of the Circle is:"+ circum);


    }
    public static void main(String[] args) {
        Circle obj=new Circle(3.02);
        obj.displayResults();
    }
}