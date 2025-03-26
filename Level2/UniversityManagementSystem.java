class Student{
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber,String name, double CGPA){
        this.rollNumber=rollNumber;
        this.name=name;
        this.CGPA=CGPA;
    }

    public double getCGPA(){
        return CGPA;

    }

    public void setCGPA(double CGPA){
        if(CGPA>0&&CGPA<=10){
            this.CGPA=CGPA;
        }

        else{
            System.out.println("Invalid CGPA!!!");
        }

    }

    public void displayDetails(){
        System.out.println("The name of student is:"+name);
        System.out.println("The roll_number of the student is: "+rollNumber);
        System.out.println("The CGPA of the student is :"+ CGPA);
    }
}

class PostGraduateStudent extends Student{
    private String researchTopic;
    public PostGraduateStudent(int rollNumber,String name,double CGPA,String researchTopic){
        super(rollNumber, name, CGPA);
        this.researchTopic=researchTopic;
    }

    public void PGInfo(){
        System.out.println("Postgraduate Student Info:");
        System.out.println("Name (protected): " + name); // Accessing protected member
        System.out.println("Research Topic: " + researchTopic);
    }
}

public class UniversityManagementSystem{
    public static void main(String[] args) {
        Student s1=new Student(101,"Om",8.8);
        s1.displayDetails();
        System.out.println();

        s1.setCGPA(9.2);
        System.out.println("Updated CGPA:"+s1.getCGPA());

        System.out.println();

        PostGraduateStudent p1=new PostGraduateStudent(102, "Ram", 9.1, "AI");

        p1.PGInfo();




    }
}