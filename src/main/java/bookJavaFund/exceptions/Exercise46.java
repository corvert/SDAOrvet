package bookJavaFund.exceptions;

public class Exercise46 {
    public static int parseUsersAge(String ageString){
        return Integer.parseInt(ageString);
    }
    public static void readUserInfo() throws Exception {
        try {
            int age = parseUsersAge("fifty five");
        } catch (NumberFormatException e) {
            throw new Exception("Problem while parsing user's age", e.getCause());
        }
    }

    public static void main(String[] args) throws Exception {
        readUserInfo();
    }
}
