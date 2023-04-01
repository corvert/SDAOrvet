package bookJavaFund.list;

class Student {
    private String name;
    private Integer age;
    private Integer yearOfPassing;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfPassing() {
        return yearOfPassing;
    }

    public void setYearOfPassing(int releaseYr) {
        this.yearOfPassing = releaseYr;
    }

    @Override
    public boolean equals(Object o) {
        Student m = (Student) o;
        return m.name.equals(this.name) && m.age.equals(this.age) && m.yearOfPassing.equals(this.yearOfPassing);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.age.hashCode() + this.yearOfPassing.hashCode();
    }
}