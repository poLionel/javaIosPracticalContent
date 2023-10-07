package ch.heigvd.dai;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        //Binary write and read without buffer
        System.out.println("Binary read and write without buffer\n");

        Measure.write("binary_1B.bin", 1, false, Measure.FileType.BINARY);
        Measure.write("binary_1000B.bin", 1024, false, Measure.FileType.BINARY);
        Measure.write("binary_1MB.bin", 1048576, false, Measure.FileType.BINARY);
        Measure.write("binary_5MB.bin", 5242880, false, Measure.FileType.BINARY);
        Measure.read("binary_1B.bin", false, Measure.FileType.BINARY);
        Measure.read("binary_1000B.bin", false, Measure.FileType.BINARY);
        Measure.read("binary_1MB.bin", false, Measure.FileType.BINARY);
        Measure.read("binary_5MB.bin", false, Measure.FileType.BINARY);

        //Binary write and read with buffer
        System.out.println("\nBinary read and write with buffer\n");

        Measure.write("binary_1B.bin", 1, true, Measure.FileType.BINARY);
        Measure.write("binary_1000B.bin", 1024, true, Measure.FileType.BINARY);
        Measure.write("binary_1MB.bin", 1048576, true, Measure.FileType.BINARY);
        Measure.write("binary_5MB.bin", 5242880, true, Measure.FileType.BINARY);
        Measure.read("binary_1B.bin", true, Measure.FileType.BINARY);
        Measure.read("binary_1000B.bin", true, Measure.FileType.BINARY);
        Measure.read("binary_1MB.bin", true, Measure.FileType.BINARY);
        Measure.read("binary_5MB.bin", true, Measure.FileType.BINARY);

        //Text write and read without buffer
        System.out.println("\nText write and read without buffer\n");

        Measure.write("text_1B.txt", 1, false, Measure.FileType.TEXT);
        Measure.write("text_1000B.txt", 1024, false, Measure.FileType.TEXT);
        Measure.write("text_1MB.txt", 1048576, false, Measure.FileType.TEXT);
        Measure.write("text_5MB.txt", 5242880, false, Measure.FileType.TEXT);
        Measure.read("text_1B.txt", false, Measure.FileType.TEXT);
        Measure.read("text_1000B.txt",false, Measure.FileType.TEXT);
        Measure.read("text_1MB.txt", false, Measure.FileType.TEXT);
        Measure.read("text_5MB.txt", false, Measure.FileType.TEXT);

        //Text write and read without buffer
        System.out.println("\nText write and read with buffer\n");

        Measure.write("text_1B.txt", 1, true, Measure.FileType.TEXT);
        Measure.write("text_1000B.txt", 1024, true, Measure.FileType.TEXT);
        Measure.write("text_1MB.txt", 1048576, true, Measure.FileType.TEXT);
        Measure.write("text_5MB.txt", 5242880, true, Measure.FileType.TEXT);
        Measure.read("text_1B.txt", true, Measure.FileType.TEXT);
        Measure.read("text_1000B.txt",true, Measure.FileType.TEXT);
        Measure.read("text_1MB.txt", true, Measure.FileType.TEXT);
        Measure.read("text_5MB.txt", true, Measure.FileType.TEXT);
    }
}