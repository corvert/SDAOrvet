package bookJavaFund.salary;

public class Salary {
    public static void main(String[] args) {
        int workerHours = 10;
        double salary = 0;

        if (workerHours <= 8) {
            salary = workerHours * 10;
        } else if ((workerHours > 8) && (workerHours < 12)) {
            salary = 8 * 10 + (workerHours - 8) * 12;
        } else {
            salary = 160;

        }
        System.out.println("The worker's salary is " + salary);
    }
}
