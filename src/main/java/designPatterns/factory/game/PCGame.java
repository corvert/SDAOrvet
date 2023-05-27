package designPatterns.factory.game;

public class PCGame implements Game{
    @Override
    public String getName() {
        return "PC game";
    }

    @Override
    public String getType() {
        return "PC game type";
    }
}
