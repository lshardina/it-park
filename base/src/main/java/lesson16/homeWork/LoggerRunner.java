package lesson16.homeWork;

import java.io.*;
import java.util.logging.LogManager;


public class LoggerRunner {
    public static void main(String[] args) throws IOException {

        try {
            LogManager.getLogManager().readConfiguration(
                    LoggerRunner.class.getResourceAsStream("logging.properties")
            );
        } catch (IOException e) {
            e.printStackTrace();
        }

        LoggerMy l1 = new LoggerMy("Warning", " возникло Предупреждение!");
        LoggerMy l2 = new LoggerMy("Error", " возникла Ошибка!!!");
        LoggerMy l3 = new LoggerMy("Info", "создано Информационное сообщение");

        System.out.println("Идет запись ошибок в файл application.log, ожидайте ....");

        try {
            l1.t.join();
            l2.t.join();
            l3.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("--------------------------------------------------------------");
        System.out.println("Файл application.log сформирован. Выведем содержимое на экран:");
        loggerPrint();

    }

    public static void loggerPrint() throws IOException {
        InputStream input = new BufferedInputStream(new FileInputStream("application.log"));
        byte[] buffer = new byte[8192];

        try {
            for (int length = 0; (length = input.read(buffer)) != -1; ) {
                System.out.write(buffer, 0, length);
            }
        } finally {
            input.close();
        }
    }

}
