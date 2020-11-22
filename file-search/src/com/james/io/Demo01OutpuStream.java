package com.james.io;


import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @version 1.8
 * @ClassName Demo01OutpuStream
 * @Description TODO
 * @Author James
 * @date 2020/11/22 16:38
 */
public class Demo01OutpuStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("file-search\\a.txt", true);
        for(int i=0; i<10; i++){
            fos.write("你好".getBytes());
            /**
             * 写换行符
             *  windows:\r\n
             *  linux:/n
             *  mac:/r
             */
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
