package codeWars;

public class MorseCodeDecoder {
    public static void main(String[] args) {

            System.out.println(decode(".... . -.--   .--- ..- -.. ."));
    }
    public static String decode(String morseCode) {
        String[] words = morseCode.split("\\s{3}");
        StringBuffer result = new StringBuffer();
        for(String word : words)
        {
            String[] codes = word.split("\\s{1}");
            for(String code : codes)
            {
            //    result.append(MorseCode.get(code));
            }
            result.append(" ");
        }

        return result.toString().trim();
    }
}
