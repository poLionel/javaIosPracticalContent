package ch.heigvd.dai.binary;

import ch.heigvd.dai.Readable;

import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFileReader implements Readable {

    @Override
    public void read(String filename) throws IOException {
        try(FileInputStream fileInputStream = new FileInputStream(filename);){
            int byteRead = 0;

            while(byteRead != -1){
                byteRead = fileInputStream.read();
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}