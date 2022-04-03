package lesson28.hw.impl;

import lesson28.hw.DoNonArhive;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@Component
@RequiredArgsConstructor
public class DoNonArhiveImpl implements DoNonArhive {

    public void nonArhiveRun(String arh) {
        Path path = Paths.get(arh);
        String nameDirectory = String.valueOf(path.getParent());
        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(arh))) {
            ZipEntry entry;
            String fileName;
            while ((entry = zipInputStream.getNextEntry()) != null) {
                fileName = entry.getName();
                System.out.printf("Файл в архиве: %s \n", fileName);

                FileOutputStream fileOutputStream = new FileOutputStream(nameDirectory + "/" + fileName);
                for (int i = zipInputStream.read(); i != -1; i = zipInputStream.read()) {
                    fileOutputStream.write(i);
                }
                fileOutputStream.flush();
                zipInputStream.closeEntry();
                fileOutputStream.close();
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("помещен(ы) в папку: " + nameDirectory);
    }
}
