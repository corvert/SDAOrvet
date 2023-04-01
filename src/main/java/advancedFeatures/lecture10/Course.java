package advancedFeatures.lecture10;

import java.util.Set;
import java.util.TreeSet;

public class Course {
    private String courseName;
    private String code;
    private String teacherName;
    private Set<String> studentsInCourse;

    public Course(String courseName, String code, String teacherName) {
        this.courseName = courseName;
        this.code = code;
        this.teacherName = teacherName;
        this.studentsInCourse = new TreeSet<>();
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", code='" + code + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", studentsInCourse=" + studentsInCourse +
                '}';
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Set<String> getStudentsInCourse() {
        return studentsInCourse;
    }

    public void setStudentsInCourse(Set<String> studentsInCourse) {
        this.studentsInCourse = studentsInCourse;
    }
}
