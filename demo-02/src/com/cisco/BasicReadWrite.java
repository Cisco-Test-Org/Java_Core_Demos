package com.cisco;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BasicReadWrite {
    public static void main(String[] args) throws IOException {

        byte[] data = "Let's read this text and write it into a file".getBytes();
        ByteArrayInputStream inputStream = new ByteArrayInputStream(data);
        inputStream.read(data);

        File newFile = new File("E:\\2022\\my-file.txt");
        FileOutputStream outputStream = new FileOutputStream(newFile);
        outputStream.write(data);
    }
}
