public class Multiplication {
    public static void main(String[] args) {
        int tableSize = 11;
        printTable(tableSize);
    }

    public static void printTable(int tableSize) {
        for (int i = 1; i < tableSize; i++) {
            for (int j = 1; j < tableSize; j++) {
                System.out.format("%4s", i * j);
            }
            System.out.println();
        }
    }
}