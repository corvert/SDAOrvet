package advancedFeatures.enrollmentTask;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private String courseCode;
    private String teacherName;
    private List<Student> enrolledStudents;

    public Course(String name, String courseCode, String teacherName, List<Student> students) {
        this.name = name;
        this.courseCode = courseCode;
        this.teacherName = teacherName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(Student student){
        enrolledStudents.add(student);
       student.enrollCourse(this);
    }

    public void removeStudent(Student student){
        enrolledStudents.remove(student);
    }

    public String getName() {
        return name;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public List<Student> getEnrolledStudent() {
        return enrolledStudents;
    }

    @Override
    public String toString() {
        return "CourseTask{" +
                "name='" + name + '\'' +
                ", courseCode='" + courseCode + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", studentTasks=" + enrolledStudents +
                '}';
    }
}
