public class StudentCourse {
    private String studentName;
    private String program;
    private int semester;
    private java.util.List<String> courses;

    public StudentCourse(String studentName, String program, int semester) {
        this.studentName = studentName;
        this.program = program;
        this.semester = semester;
        this.courses = new java.util.ArrayList<String>();
    }

    public void registerCourse(String course) {
        courses.add(course);
    }

    public void displayStudentCourseInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        System.out.println("Registered Courses:");
        for (String course : courses) {
            System.out.println("- " + course);
        }
    }

    public static void main(String[] args) {
        StudentCourse sc = new StudentCourse("Ravi Kumar", "B.Tech CSE", 4);
        sc.registerCourse("Operating Systems");
        sc.registerCourse("Database Systems");
        sc.displayStudentCourseInfo();
    }
}
