public class Multi3x3 {

    public static void main(String[] args) {

        int tableSize = 4;
        printTable(tableSize);

    }


    public static void printTable(int tableSize) {
        System.out.println("+---+---+---+");
        for (int i = 1; i < tableSize; i++) {
            for (int j = 1; j < tableSize; j++) {

                System.out.printf("| %1s ", i * j);
            }
            System.out.println("|");
            System.out.println("+---+---+---+");

        }
    }
}
