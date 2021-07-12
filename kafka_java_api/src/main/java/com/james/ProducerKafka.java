package com.james;

import java.util.*;

public class ProducerKafka {

    public static void main(String[] args) {
        Integer a=1;
        chg(a);
        Integer b=chg(a);
        chg(b);
        System.out.println(b);
        System.out.println(a);

//        String s = "hello";
//        System.out.println(s.hashCode());
//        chg2(s);
//        System.out.println(s);
    }

//    private static void chg2(String str) {
//        System.out.println(str.hashCode());
//        str = new String("world");
//    }

    public static Integer chg(Integer a){
        System.out.println("a前：" + System.identityHashCode(a));
        a=a+1;
        System.out.println("a后：" + System.identityHashCode(a));
        return a;
    }
}
