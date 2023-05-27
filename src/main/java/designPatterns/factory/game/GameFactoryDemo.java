package designPatterns.factory.game;

public class GameFactoryDemo {
    public static void main(String[] args) {
        Game game1 = GameFactory.getGameFactory("PCGame");
        System.out.println(game1.getName());
        System.out.println(game1.getType());

        Game game = GameFactory.getGameFactory("BoardGame");
        System.out.println(game.getName());
        System.out.println(game.getType());
    }
}
