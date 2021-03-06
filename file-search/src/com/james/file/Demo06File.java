package com.james.file;

/**
 * @version 1.8
 * @ClassName Demo06File
 * @Description TODO
 * @Author James
 * @date 2020/11/21 17:05
 */

import java.io.File;

/**
 * File类遍历（文件夹）目录功能
 *  - public String[] list():发挥一个String数组，表示该File目录中的所有子文件或目录(包括隐藏文件/文件夹)。
 *  - public File[] listFiles():返回一个File数组，表示该File目录中的所有的子文件或目录(包括隐藏文件/文件夹)。
 *
 *  注意：
 *      list方法和listFiles方法遍历的是构造方法中给出的目录
 *      如果构造方法中给出的目录的路径不存在，会抛出空指针异常
 *      如果构造方法中给出的路径不是一个目录，也会抛出空指针异常
 */
public class Demo06File {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    /**
     *
     */
    private static void show02() {
        File file = new File("file-search");
        File[] files = file.listFiles();
        for(File f: files){
            System.out.println(f);
        }
    }

    /**
     * public String[] list():发挥一个String数组，表示该File目录中的所有子文件或目录。
     * 遍历构造方法中给出的目录，会获取目录中所有文件/文件夹的名称，把获取到的多个名称存储到一个String类型的数组中
     */
    private static void show01() {
        //File f1 = new File("file-se");//NullPointerException
        File f1 = new File("file-search");
        String[] arr = f1.list();
        for(String fileName : arr) {
            System.out.println(fileName);
        }

    }
}
