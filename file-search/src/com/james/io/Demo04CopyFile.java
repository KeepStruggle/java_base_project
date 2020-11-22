package com.james.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @version 1.8
 * @ClassName Demo04CopyFile
 * @Description TODO
 * @Author James
 * @date 2020/11/22 17:42
 */
public class Demo04CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        //1、创建一个字节输入流对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("file-search\\1.jpg");
        //2、创建一个字节输出流对象，构造方法中绑定要写入的目的地
        FileOutputStream fos = new FileOutputStream("file-search\\copyFile\\1.jpg");
        //3、使用字节输入流对象中的方法read读取文件
        /**
        int len;
        while ((len = fis.read()) != -1){
            //4、使用字节输出流中的方法write()，把读取到的字节写入到目的地的文件中
            fos.write(len);
        }
         */

        //使用字节数组缓冲读取多个字节，写入多个字节；而不是读一个，写一个
        byte[] bytes = new byte[1024];
        int len = 0;//记录读取的有效字节个数
        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes, 0, len);
        }

        //5、释放资源（先关写的，后关读的；如果写完了，肯定读取完了）
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时：" + (e-s) + "毫秒");
    }
}
