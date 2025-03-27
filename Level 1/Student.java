public class Student {
    static String universityName = "SRM";
    private static int totalStudents = 0;
    private final int rollNumber;
    private String name;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid student object.");
        }
    }

    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated for Roll Number: " + rollNumber);
        } else {
            System.out.println("Cannot update grade. Invalid student object.");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Om", 201, "A");
        Student s2 = new Student("Ram", 202, "B");

        s1.displayStudentDetails();
        System.out.println();

        s2.displayStudentDetails();
        System.out.println();

        s2.updateGrade("A+");
        s2.displayStudentDetails();
        System.out.println();

        Student.displayTotalStudents();
    }
}
