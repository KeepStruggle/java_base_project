package com.james.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @version 1.8
 * @ClassName Demo03InputStream
 * @Description TODO
 * @Author James
 * @date 2020/11/22 17:20
 */
public class Demo03InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("file-search\\b.txt");
        byte[] bytes = new byte[1024];
        int len;
        while((len = fis.read(bytes)) != -1){
            System.out.println(new String(bytes, 0, len));
        }
        fis.close();
    }
}
