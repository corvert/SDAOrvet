package bookJavaFund;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Java programmers ");
        stringBuilder.append("are wise ");
        stringBuilder.append("and knowledgeable");
        System.out.println("The string is \n" + stringBuilder.toString());

        System.out.println("The length of the string is " + stringBuilder.length());
        System.out.println("The capacity of the string is " + stringBuilder.capacity());
        System.out.println("The string reversed is: \n" + stringBuilder.reverse());
    }
}
