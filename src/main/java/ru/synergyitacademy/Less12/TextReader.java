package ru.synergyitacademy.Less12;

import org.apache.commons.io.IOUtils;
import ru.synergyitacademy.Less11.ExRun;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class TextReader {
    public static String getContent(String fileName) throws IOException, CustomException {
        URL resource = ExRun.class.getResource("/" + fileName);
        if (resource != null){
        try (FileInputStream fileInputStream = new FileInputStream(FinallyLauncher.class.getResource("/" + fileName).getFile())){
          return IOUtils.toString(fileInputStream, StandardCharsets.UTF_8);

        } }
        throw new CustomException(/*"File " + fileName + "isnt found on file system"*/);
    }

}
