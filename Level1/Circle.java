<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 8753cdb (Week 2->Day 2)
>>>>>>> f789003 (Week 2->Day 2)
>>>>>>> 3b2fd14 (Week 2->Day 2)
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
<<<<<<< HEAD
}
=======
<<<<<<< HEAD
}
=======
<<<<<<< HEAD
}
=======
}
=======
class Circle {
    double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void displayDetails() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle Details:");
        defaultCircle.displayDetails();

        System.out.println();

        Circle customCircle = new Circle(5.0);
        System.out.println("Custom Circle Details:");
        customCircle.displayDetails();
    }
}

>>>>>>> 590a828 (Week 2->Day 2)
>>>>>>> 8753cdb (Week 2->Day 2)
>>>>>>> f789003 (Week 2->Day 2)
>>>>>>> 3b2fd14 (Week 2->Day 2)
