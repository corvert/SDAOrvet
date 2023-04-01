package advancedFeatures.lecture10;

import java.util.Set;
import java.util.TreeSet;

public class Student {
    private int id;
    private String name;
    private String major;
    private Set<String> courses;

    public Student(int id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.courses = new TreeSet<>();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", courses=" + courses +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Set<String> getCourses() {
        return courses;
    }

    public void setCourses(Set<String> courses) {
        this.courses = courses;
    }
}
