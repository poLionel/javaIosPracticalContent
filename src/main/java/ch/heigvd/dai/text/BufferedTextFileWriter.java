package ch.heigvd.dai.text;

import ch.heigvd.dai.Writable;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;

public class BufferedTextFileWriter implements Writable {
    @Override
    public void write(String filename, int sizeInBytes) throws IOException {
        try(BufferedWriter out = new BufferedWriter(new FileWriter(filename, StandardCharsets.UTF_8))){
            for(int i = 0; i < sizeInBytes; ++i){
                out.write("c");
            }
            out.flush();
        }
    }
}
