package codeWars;

public class YesOrNo {
    public static void main(String[] args) {
        System.out.println(boolToWord(false));
    }
    public static String boolToWord(boolean b) {
        if (b == true) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
