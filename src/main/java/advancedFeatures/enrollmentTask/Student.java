package advancedFeatures.enrollmentTask;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private Major major;
    private List<Course> enrollCourse;

    public Student(String name, int id, Major major) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.enrollCourse = new ArrayList<>();
    }

    public void enrollCourse(Course course){
        if (enrollCourse.contains(course)){
            throw new IllegalArgumentException("Already in");
        }
        enrollCourse.add(course);
    }

    public void dropCourse(Course course){
        if(!enrollCourse.contains(course)){
            throw new IllegalArgumentException("not in this course");
        }
        enrollCourse.remove(course);
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Major getMajor() {
        return major;
    }

    public List<Course> getEnrollCourse() {
        return enrollCourse;
    }

    @Override
    public String toString() {
        return "StudentTask {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", majorTask=" + major +
                ", enrollCourseTasks=" + enrollCourse +
                '}';
    }
}
