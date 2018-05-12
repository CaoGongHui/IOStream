package io.filewriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader=new FileReader("demo.txt");
        char [] arr=new char[1024];
        int len=0;
        while ((len=fileReader.read(arr))!=-1){
            System.out.println(new String(arr,0,len));
        }
 /*       int num=fileReader.read(arr);
        System.out.println(new String(arr)+":"+num);
        int num1=fileReader.read(arr);
        System.out.println(new String(arr)+":"+num1);
        int num2=fileReader.read(arr);
        System.out.println(new String(arr)+":"+num2);*/
        fileReader.close();
    }
}
