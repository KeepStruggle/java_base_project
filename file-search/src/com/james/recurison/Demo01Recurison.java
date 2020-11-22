package com.james.recurison;

import java.io.File;

/**
 * @version 1.8
 * @ClassName Demo01Recurison
 * @Description TODO
 * @Author James
 * @date 2020/11/22 15:31
 */
public class Demo01Recurison {
    public static void main(String[] args) {
        File file = new File("file-search");
        getAllFile(file);
    }

    /**
     * 定义一个方法，对目录来进行遍历
     * @param file
     */
    private static void getAllFile(File file) {
        //System.out.println(file);//打印被遍历的目录的路径名
        File[] files = file.listFiles();
        for(File f: files){
            //对遍历得到的File对象进行保存，判断是否是文件夹
            if(f.isDirectory()){
                //f是一个文件夹，则继续遍历这个文件夹
                //我们发现getAllFile()方法就是遍历传递文件夹的方法，遍历文件夹的方法
                //所以直接调用getAllFile()方法即可：递归（自己调用自己）
                getAllFile(f);
            }else {
                //f是一个文件，直接打印即可
                //查看以.java结尾的文件
                if(f.getName().toLowerCase().endsWith(".java")){
                    System.out.println(f);
                }
            }
        }
    }
}
