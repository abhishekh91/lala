import java.time.LocalDate;
import java.time.Period;

class Student {
    String name;
    LocalDate dob;

    Student(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    void displayStudentDetails() {
        Period age = Period.between(dob, LocalDate.now());
        System.out.println("Name: " + name + ", Age: " + age.getYears());
    }
}
class Course {
    String courseName;
    int semester;
    int marks;

    Course(String courseName, int semester, int marks) {
        this.courseName = courseName;
        this.semester = semester;
        this.marks = marks;
    }

    void displayCourse() {
        System.out.println("Course: " + courseName + ", Semester: " + semester + ", Marks: " + marks);
    }
}
