public class Unique {
    public static void main(String[] args) {
        String a = "aaaaaa";
        String b = "aaabbbbb";
        String c = "abcdefgh";
        String d = "Ju780iu6G768";
        System.out.println(removeDups(a));
        System.out.println(removeDups(b));
        System.out.println(removeDups(c));
        System.out.println(removeDups(d));

    }

    public static String removeDups(String text) {
        if (text == null) {
            return text;
        }
        if (text == ""){
            return text;
        }
        if (text.length() == 1){
            return text;
        }
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean isDuplicate = false;
            for (int j = 0; j < result.length(); j++) {
                char d = result.charAt(j);
                if (c == d) { // duplicate found
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result += "" + c;
            }
        }
        return result;
    }
}
