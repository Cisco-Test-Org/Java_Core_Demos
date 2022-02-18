package com.cisco;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("E:\\2022\\my-file.txt");
            BufferedInputStream inputStream = new BufferedInputStream(fileInputStream);
            int i;
            while ((i = inputStream.read()) != -1){
                System.out.print((char) i);
            }
            inputStream.close();
            fileInputStream.close();

        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
