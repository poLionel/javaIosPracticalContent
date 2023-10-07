package ch.heigvd.dai.binary;

import ch.heigvd.dai.Writable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class BinaryFileWriter implements Writable {

    @Override
    public void write(String filename, int sizeInBytes) throws IOException {
        try(FileOutputStream fileOutputStream = new FileOutputStream(filename)){
            for(int i = 0; i < sizeInBytes; ++i){
                fileOutputStream.write((byte)'c');
            }

            fileOutputStream.flush();
        }

    }
}
