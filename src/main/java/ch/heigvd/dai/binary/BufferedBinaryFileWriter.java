package ch.heigvd.dai.binary;

import ch.heigvd.dai.Writable;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BufferedBinaryFileWriter implements Writable {

    @Override
    public void write(String filename, int sizeInBytes) throws IOException {
        try(BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(filename));){
            for(int i = 0; i < sizeInBytes; ++i){
                out.write((byte)'c');
            }
            out.flush();
        }
    }
}
