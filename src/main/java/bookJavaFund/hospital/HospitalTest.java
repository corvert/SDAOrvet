package bookJavaFund.hospital;

public class HospitalTest {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Patient patient = new Patient();
        String str = doctor.getPersonType();
        String str1 = patient.getPersonType();
        System.out.println(str);
        System.out.println(str1);
    }
}
