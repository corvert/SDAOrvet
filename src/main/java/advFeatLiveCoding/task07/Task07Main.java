package advFeatLiveCoding.task07;

public class Task07Main {
    public static void main(String[] args) {


        Employee fred = new Employee("Fred", "Fredriskon", 2000, 32);
        Employee barry = new Employee("Barry", "Joke", 4000, 21);
        Employee jake = new Employee("Jake", "Paul", 1000, 40);
        Employee tom = new Employee("Tom", "Holland", 7000, 35);
        Company company = new Company();

        company.addEmpolyees(fred, barry, jake, tom);
        System.out.println(company.getAverageSalary());
        System.out.println(company.getOldestEmployee());
        System.out.println(company.getRandomEmployee().getFirstName());
    }

}
