package bookJavaFund.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayDeque;

public class SendAllEmails {
    private static Process runningProcess = null;

    public static void main(String[] args) throws Exception {
        ArrayDeque<String> queue = new ArrayDeque<>();
        FileReader fileReader = new FileReader("users.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try (CSVReader reader = new CSVReader(bufferedReader)) {
            String[] row;
            while ((row = reader.readNow()) != null) {
                User user = User.fromValues(row);

                queue.offer(user.email);
                Thread.sleep(100);
            }
        }
        while (!queue.isEmpty()) {
            sendEmailWhenReady(queue);
            //wait before checking again
            Thread.sleep(100);
        }
        while (runningProcess.isAlive()) {
            System.out.println(".");
            Thread.sleep(100);
        }
        System.out.println("Done sending emails!");


    }

    private static void sendEmailWhenReady(ArrayDeque<String> queue) throws Exception {
        //if running, return
        if (runningProcess != null && runningProcess.isAlive()) {
            System.out.println(".");
            return;
        }
        System.out.println("Sending email");
        String email = queue.poll();
        String classpath = System.getProperty("java.class,path");
        String[] command = new String[]{
                "java", "-cp", classpath, "EmailSender", email
        };
        runningProcess = Runtime.getRuntime().exec(command);
    }
}
