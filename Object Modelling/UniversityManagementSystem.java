import java.util.*;

class Professor {
    String name;
    Professor(String name) {
        this.name = name;
    }
}

class Course {
    String name;
    Professor professor;
    List<Student> students = new ArrayList<>();

    Course(String name, Professor professor) {
        this.name = name;
        this.professor = professor;
    }

    void enroll(Student s) {
        students.add(s);
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();
    Student(String name) {
        this.name = name;
    }

    void register(Course c) {
        courses.add(c);
        c.enroll(this);
    }

    void showCourses() {
        System.out.print(name + " is registered in: ");
        for (Course c : courses) {
            System.out.print(c.name + " ");
        }
        System.out.println();
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Professor prof = new Professor("Dr. Rao");
        Course c1 = new Course("AI", prof);
        Course c2 = new Course("ML", prof);

        Student s1 = new Student("Asha");
        Student s2 = new Student("Kunal");

        s1.register(c1);
        s1.register(c2);
        s2.register(c2);

        s1.showCourses();
        s2.showCourses();
    }
}
