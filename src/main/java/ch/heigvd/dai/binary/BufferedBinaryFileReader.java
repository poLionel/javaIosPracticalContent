package ch.heigvd.dai.binary;

import ch.heigvd.dai.Readable;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;

public class BufferedBinaryFileReader implements Readable {

    @Override
    public void read(String filename) throws IOException {
        // TODO : implement this method
        try(InputStream inputStream = new FileInputStream(filename);){
            BufferedInputStream in = new BufferedInputStream(inputStream);

            int counter = 0;
            while (counter != -1)
                counter = in.read();
        }
    }
}
