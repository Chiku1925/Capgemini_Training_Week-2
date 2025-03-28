import java.util.*;

class Course {
    String name;
    Course(String name) {
        this.name = name;
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enroll(Course c) {
        courses.add(c);
    }

    void showCourses() {
        System.out.print(name + " enrolled in: ");
        for (Course c : courses) {
            System.out.print(c.name + " ");
        }
        System.out.println();
    }
}

class School {
    List<Student> students = new ArrayList<>();

    void addStudent(Student s) {
        students.add(s);
    }

    void showAll() {
        for (Student s : students) {
            s.showCourses();
        }
    }
}

public class SchoolStudentCourse {
    public static void main(String[] args) {
        Course java = new Course("Java");
        Course math = new Course("Math");

        Student s1 = new Student("Amit");
        s1.enroll(java);
        s1.enroll(math);

        Student s2 = new Student("Sana");
        s2.enroll(math);

        School school = new School();
        school.addStudent(s1);
        school.addStudent(s2);
        school.showAll();
    }
}
