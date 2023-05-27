package advFeatLiveCoding.task10;

public enum Status {
    DONE("Done"),
    TODOO("ToDo");

    private String name;

    Status(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
