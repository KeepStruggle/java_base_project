package com.james.io;

/**
 * @version 1.8
 * @ClassName Demo06Writer
 * @Description TODO
 * @Author James
 * @date 2020/11/22 18:59
 */

import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符输出流的使用步骤：
 *      1、创建FileWriter对象，构造方法中绑定要写入数据的目的地
 *      2、使用FileWriter中的方法，吧数据写入到内存缓冲区中（字符转换为字节的过程）
 *      3、使用FileWriter中的方法flush，把内存缓冲区中的数据，刷新到新文件中
 *      4、释放资源（会先把内存缓冲区中的数据刷新到文件中）
 */
public class Demo06Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("file-search\\b.txt");
        fw.write(97);

        char[] chars = {'a', 'b', 'c', 'd'};
        fw.write(chars);

        fw.write("詹姆斯");

        fw.write("詹姆斯James", 3, 5);

        //fw.flush();
        fw.close();
    }


}
