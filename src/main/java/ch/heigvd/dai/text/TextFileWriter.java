package ch.heigvd.dai.text;

import ch.heigvd.dai.Writable;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class TextFileWriter implements Writable {

    @Override
    public void write(String filename, int sizeInBytes) throws IOException {
        try(FileWriter fw = new FileWriter(filename, StandardCharsets.UTF_8)){
            for(int i = 0; i < sizeInBytes; ++i){
                fw.write('a');
            }
        }
    }
}
