package advancedFeatures.enrollmentTask;

public enum Major {
    COMPUTER_SCIENCE("Computer Science"),
    BUSINESS("Business"),
    LAW("Law");

    private String name;

    Major(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
