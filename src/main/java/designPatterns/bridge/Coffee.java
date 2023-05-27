package designPatterns.bridge;

public class Coffee implements  Drink{
    @Override
    public String getVolume() {
        return "500ml";
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
