package advancedFeatures.enrollmentTask;

import java.util.ArrayList;
import java.util.List;

public class Enrollment {

    private List<Student> students; // all students
    private List<Course> courses; // all courses

    public Enrollment() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addStudent(Student student){
        if (this.students.contains(student)){
            throw new IllegalArgumentException("Already there");
        }
        this.students.add(student);
    }

    public void removeStudent(Student student){
        this.students.remove(student);
    }

    public void  addCourse(Course course){
        if (this.courses.contains(course)){
            throw new IllegalArgumentException("Course already exits");
        }
        this.courses.add(course);
    }



    public void enrollStudentInCourse(Student student, Course course){
        if (!this.students.contains(student)){
            throw new IllegalArgumentException("Student dosn't exist");
        }
        if (!this.courses.contains(course)){
            throw new IllegalArgumentException("Course does not exitst");
        }
        course.enrollStudent(student);
        student.enrollCourse(course);
    }

    public List<Course> getCourseForStudent (Student student){
        return student.getEnrollCourse();
    }

    public List<Student> getStudentForCourse(Course course){
        return course.getEnrolledStudent();
    }

}
