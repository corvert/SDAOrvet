package designPatterns.bridge;

public class Cola implements Drink{
    @Override
    public String getVolume() {
        return "200ml";
    }

    @Override
    public boolean isAddictive() {
        return true;
    }

    @Override
    public int getNumberOfSugarLumps() {
        return 50;
    }
}
