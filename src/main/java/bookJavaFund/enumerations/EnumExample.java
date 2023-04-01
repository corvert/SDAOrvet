package bookJavaFund.enumerations;

public class EnumExample {
    public static void main(String[] args) {
        Direction north = Direction.NORTH;
        System.out.println(north + " : " + north.no);
        Direction south = Direction.valueOf("SOUTH");
        System.out.println(south + " : " + south.no);
    }
}
