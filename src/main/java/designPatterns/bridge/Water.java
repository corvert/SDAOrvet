package designPatterns.bridge;

public class Water implements Drink{
    @Override
    public String getVolume() {
        return "330ml";
    }

    @Override
    public boolean isAddictive() {
        return false;
    }

    @Override
    public int getNumberOfSugarLumps() {
        return 0;
    }
}
