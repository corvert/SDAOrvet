package designPatterns.factory.game;

public class GameFactory {

    public static Game getGameFactory(String name){
        if(name.equalsIgnoreCase("PCGame")){
            return new PCGame();
        } else {
            return new BoardGame();
        }
    }
}
