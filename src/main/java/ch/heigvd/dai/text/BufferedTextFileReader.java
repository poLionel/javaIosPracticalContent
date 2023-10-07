package ch.heigvd.dai.text;

import ch.heigvd.dai.Readable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class BufferedTextFileReader implements Readable {
    @Override
    public void read(String filename) throws IOException {
        try(BufferedReader in = new BufferedReader(new FileReader(filename, StandardCharsets.UTF_8))){
            int a = 0;
            while (a != -1)
                a = in.read();
        }
    }
}
