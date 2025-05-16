public class StudentCourseMarks {
    private java.util.Map<String, java.util.Map<String, Integer>> studentMarks;

    public StudentCourseMarks() {
        studentMarks = new java.util.HashMap<String, java.util.Map<String, Integer>>();
    }

    public void addStudentMark(String studentName, String course, int mark) {
        studentMarks.putIfAbsent(studentName, new java.util.HashMap<String, Integer>());
        studentMarks.get(studentName).put(course, mark);
    }

    public void displayMarksBelowThreshold(int threshold) {
        for (String student : studentMarks.keySet()) {
            java.util.Map<String, Integer> courseMarks = studentMarks.get(student);
            for (java.util.Map.Entry<String, Integer> entry : courseMarks.entrySet()) {
                if (entry.getValue() < threshold) {
                    System.out.println("Student: " + student +
                                       ", Course: " + entry.getKey() +
                                       ", Marks: " + entry.getValue());
                }
            }
        }
    }

    public static void main(String[] args) {
        StudentCourseMarks scm = new StudentCourseMarks();
        scm.addStudentMark("Ravi Kumar", "Operating Systems", 35);
        scm.addStudentMark("Ravi Kumar", "Database Systems", 72);
        scm.addStudentMark("Anjali Sharma", "Maths", 38);
        scm.displayMarksBelowThreshold(40);
    }
}
