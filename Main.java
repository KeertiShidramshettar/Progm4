class Course {
    String courseName;
    int marks;

    public Course(String courseName, int marks) {
        this.courseName = courseName;
        this.marks = marks;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMarks() {
        return marks;
    }
}

class Student {
    String name;
    String program;
    int semester;
    Course[] courses;
    int courseCount;

    public Student(String name, String program, int semester) {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courses = new Course[10]; // Maximum 10 courses
        this.courseCount = 0;
    }

    public void registerCourse(Course course) {
        if (courseCount < courses.length) {
            courses[courseCount] = course;
            courseCount++;
        }
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        System.out.println("Registered Courses:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println(" - " + courses[i].getCourseName());
        }
    }

    public void displayLowMarks() {
        System.out.println("\nCourses with marks less than 40:");
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].getMarks() < 40) {
                System.out.println(" - " + courses[i].getCourseName() + ": " + courses[i].getMarks());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", "B.Tech CSE", 5);

        student.registerCourse(new Course("Mathematics", 85));
        student.registerCourse(new Course("Data Structures", 38));
        student.registerCourse(new Course("Operating Systems", 45));
        student.registerCourse(new Course("Algorithms", 30));

        student.displayStudentDetails();
        student.displayLowMarks();
    }
}
