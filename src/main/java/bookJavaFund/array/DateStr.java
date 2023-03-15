package bookJavaFund.array;

public class DateStr {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
            System.out.println(myArray[i]);
        }
        for (int i : myArray){
            System.out.print(i);
        }
    }
}
