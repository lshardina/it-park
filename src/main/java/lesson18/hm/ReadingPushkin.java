package lesson18.hm;

import lombok.SneakyThrows;

import java.io.*;
import java.nio.charset.StandardCharsets;


public class ReadingPushkin {

    @SneakyThrows({IOException.class})
    public static void main(String[] args) {


        try (BufferedReader br1 = new BufferedReader(
                new InputStreamReader(ReadingPushkin.class.getResourceAsStream("/pushkin.txt")))) {
            printPushkin(br1);  // Распечатываем исходный текст
        }

        try (BufferedReader br2 = new BufferedReader(
                new InputStreamReader(ReadingPushkin.class.getResourceAsStream("/pushkin.txt")))) {
            dividePushkin(br2); // Разбиваем текст построчно и записываем в отдельные файлы
        }
    }


    public static void printPushkin(BufferedReader bufferedReader) throws IOException {
        System.out.println("В файле  <\\resources\\pushkin.txt>  содержится текст:");
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
        }
    }

    public static void dividePushkin(BufferedReader bufferedReader) throws IOException {
        System.out.println("-------------------------------------------------------------");
        System.out.println("Разобъем исходный текст на строки и запишем в отдельные файлы:");
        System.out.println("");
        int i = 1;
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            if (!line.trim().equals("")) {
                try (FileOutputStream out = new FileOutputStream("c:\\test\\pushkin" + i + ".txt")) {
                    out.write(line.getBytes(StandardCharsets.UTF_8));
                    System.out.println("Строка: <<" + line + ">> записана в файл c:/test/pushkin" + i + ".txt");
                    i++;
                }
            }
        }
    }
}
