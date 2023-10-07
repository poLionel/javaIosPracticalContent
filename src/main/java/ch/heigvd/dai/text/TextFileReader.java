package ch.heigvd.dai.text;

import ch.heigvd.dai.Readable;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TextFileReader implements Readable {
    @Override
    public void read(String filename) throws IOException {
        try(FileReader fr = new FileReader(filename, StandardCharsets.UTF_8)){
            int a = 0;
            while(a != -1)
                a = fr.read();
        }
    }
}
