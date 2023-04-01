package advancedFeatures.lecture09.enums;

public enum Sandwich {
    PI(3.142); // 3.142

    private double piValue;
    Sandwich(final double piValue){
        this.piValue = piValue;
    }

    public double getPiValue() {
        return piValue;
    }
}
