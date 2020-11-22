package com.james.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @version 1.8
 * @ClassName Demo02InputStream
 * @Description TODO
 * @Author James
 * @date 2020/11/22 16:58
 */

/**
 * 注意事项：
 *      使用字节流读取中文文件
 *      1个中文
 *          GBK:占用两个字节
 *          UTF-8:占用三个字节
 */
public class Demo02InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("file-search\\a.txt");
        int len;//记录读到的字节
        while((len = fis.read()) != -1){
            System.out.println(len);
        }
        fis.close();
    }
}
