package designPatterns.factory.game;

public class BoardGame implements Game{
    @Override
    public String getName() {
        return "Board game";
    }

    @Override
    public String getType() {
        return "Board game type";
    }
}
