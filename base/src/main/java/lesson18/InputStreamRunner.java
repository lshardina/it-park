package lesson18;

import lombok.SneakyThrows;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class InputStreamRunner {

    @SneakyThrows({IOException.class})
       public static void main(String[] args) {
        try (InputStream fileInputStream = InputStreamRunner.class.getResourceAsStream("/file.txt")) {
            byte[] bytes = fileInputStream.readAllBytes();
            System.out.println(new String(bytes));
        }
//      fileInputStream.close();

        try (InputStream inputStream = InputStreamRunner.class.getResourceAsStream("/file.txt");
             FileOutputStream out = new FileOutputStream("C:\\test\\test.txt")) {
            inputStream.transferTo(out);
        }
        System.out.println("Запись в файл произведена успешно");



        char[] buffer = new char[512];
        try (FileReader fileReader = new FileReader("C:\\test\\test.txt")) {
            String result = "";
            while (fileReader.read(buffer) != -1) {
                result += new String(buffer);
            }
            System.out.println("Чтение файла завершено, вот что в нем было:" + result);
        }
//        inputStream.close();
//        out.close();

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(InputStreamRunner.class.getResourceAsStream("/file.txt"),
                        StandardCharsets.ISO_8859_1.name()))) {
            System.out.println(br.lines().collect(Collectors.joining()));
        }
    }
}
