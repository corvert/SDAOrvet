package advFeatLiveCoding.task10;

public enum Priority {
    LOW("Low"),
    MIDDLE("Middle"),
    HIGH("High");

    private String name;

    Priority(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
