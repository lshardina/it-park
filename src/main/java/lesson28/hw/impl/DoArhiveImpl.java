package lesson28.hw.impl;

import lesson28.hw.DoArhive;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

@Component
@RequiredArgsConstructor
public class DoArhiveImpl implements DoArhive {


    @Override
    public void arhiveRun(String arh) throws IOException {
        File fileToZip = new File(arh);
        try (FileOutputStream fos = new FileOutputStream(removeExtension(fileToZip.getAbsolutePath()) + ".zip");
             ZipOutputStream zipOut = new ZipOutputStream(fos)
        ) {
            if (fileToZip.isDirectory()) {
                zipOut.closeEntry();
                var children = fileToZip.listFiles();
                for (File childFile : children) {
                    write(childFile, childFile.getName(), zipOut);
                }
            } else {
                write(fileToZip, fileToZip.getName(), zipOut);
            }
            System.out.println("Создан архив " + removeExtension(fileToZip.getAbsolutePath()) + ".zip");
        }
    }

    public static String removeExtension(String arh) {
        int index = arh.lastIndexOf('.');
        return (index == -1) ? arh : arh.substring(0, index);
    }

    private static void write(File fileToZip, String fileName, ZipOutputStream zipOut) throws IOException {
        try (FileInputStream fis = new FileInputStream(fileToZip)) {
            ZipEntry zipEntry = new ZipEntry(fileName);
            zipOut.putNextEntry(zipEntry);
            byte[] buffer = new byte[1024];
            int lenght;
            while ((lenght = fis.read(buffer)) >= 0) {
                zipOut.write(buffer, 0, lenght);
            }
        }
    }
}
