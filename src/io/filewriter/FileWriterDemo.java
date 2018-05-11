package io.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("demo.txt");//文件不存在自动创建，文件存在则会被覆盖；
        fileWriter.write("abcde");//写入到临时存储缓冲区中；
        fileWriter.flush();//进行刷新，将数据直接写到目的地中；


    }
}
