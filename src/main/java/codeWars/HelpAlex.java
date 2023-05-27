package codeWars;

public class HelpAlex {
    public static void main(String[] args) {
        System.out.println(hoopCount(9));
    }
    public static String hoopCount(int n){
        if (n >= 10){
            return "Great, now move on to tricks";
        } else {
            return "Keep at it until you get it";
        }
    }
}
