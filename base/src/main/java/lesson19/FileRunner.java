//package lesson19;
//
//import lesson19.util.FileUtils;
//import org.apache.commons.io.FilenameUtils;
//
//import java.io.File;
//
//public class FileRunner {
//
//    public static void main(String[] args) {
//        String fileLocation = "C:\\test\\test.txt";
//        File file = new File(fileLocation);
//        String filename = file.getName();
//        System.out.println("Имя файла: " + file.getName());
//        System.out.println("Расширение файла: " + FileUtils.getFileExtension(filename));
//        System.out.println("Расширение файла: " + FilenameUtils.getExtension(filename));
//        System.out.println("Родительская папка " + file.getParent());
//        System.out.println("Существует ли файл ? " + (file.exists() ? "Да" : "Нет"));
//        System.out.println("Это файл ? " + (file.isFile() ? "Да" : "Нет"));
//        System.out.println("Создались ли промежуточные папки ? " + (file.mkdirs() ? "Да" : "Нет"));
//
//
//
//    }
//}
