package com.james.io;

import java.io.FileReader;
import java.io.IOException;

/**
 * @version 1.8
 * @ClassName Demo05Reader
 * @Description TODO
 * @Author James
 * @date 2020/11/22 18:33
 */
public class Demo05Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("file-search\\a.txt");
        /**
        int len;
        while((len = fr.read()) != -1){
            System.out.print( (char) len);
        }
         */

        char[] chars = new char[1024];
        int len = 0;//存储读取到的多个字符
        while((len = fr.read(chars)) != -1){
            System.out.println(new String(chars, 0, len));
        }

    }
}
