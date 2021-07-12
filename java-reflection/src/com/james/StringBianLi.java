package com.james;

/**
 * @version 1.8
 * @ClassName StringBianLi
 * @Description TODO
 * @Author James
 * @date 2021/3/10 23:07
 */
public class StringBianLi {

    public static void main(String[] args) {
        String s = "hello";
        for(int i=0; i<s.length();i++){
            System.out.println(s.charAt(i));
        }
        s = "hello world";
        System.out.println(s);
    }

}
