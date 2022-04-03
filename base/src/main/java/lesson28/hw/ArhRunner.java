package lesson28.hw;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.util.Scanner;


public class ArhRunner {

    public static void main(String[] args) throws IOException {

        final AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("lesson28.hw");
        final DoArhive doArhive = applicationContext.getBean(DoArhive.class);
        final DoNonArhive doNonArhive = applicationContext.getBean(DoNonArhive.class);

        System.out.println("Укажите файл для архивации/разархивации в формате C:\\SomeDir\\output.zip:");
        Scanner scanner = new Scanner(System.in);
        String arhName = scanner.nextLine();

        if (getFileExtension(arhName).equals(".zip")) {
            doNonArhive.nonArhiveRun(arhName);
        } else doArhive.arhiveRun(arhName);
    }

    private static String getFileExtension(String arhName) {
        int index = arhName.indexOf(".");
        String fileExtension;
        if (index >= 0) {
           fileExtension = arhName.substring(index);
        } else {
            fileExtension = arhName;
        }
         return fileExtension;
    }

}
