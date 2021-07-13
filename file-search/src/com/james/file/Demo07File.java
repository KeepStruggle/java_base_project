package com.james.file;

//我做了修改1
/**
 * @version 1.8
 * @ClassName Demo07File
 * @Description TODO
 * @Author James
 * @date 2020/11/21 17:24
 */

/**
 * 递归
 *  递归分为两种：直接递归和间接递归
 *  直接递归：方法自己调用自己
 *  间接递归：A方法调用B方法，B方法调用C方法，C方法调用A方法
 *
 *  注意事项：
 *      递归一定要有条件限定，保证递归能够停止下来，否则会发生栈内存溢出
 *      递归中虽然有限定条件，但是递归次数不能太多。否则也会发生栈内存溢出
 *      构造方法，禁止递归
 *
 *  递归的使用前提：
 *  当调用方法的时候，方法的主题不变，每次调用方法的参数不同，可以使用递归
 */
public class Demo07File {
    public static void main(String[] args) {
//        a();
        b(1);
    }

    /**
     * 构造方法，禁止递归
     *      编译报错：构造方法是创建兑现更实用的，一直递归会到导致内存中有无数个对象，直接编译错误
     */
    public Demo07File() {
//        Demo07File();
    }

    /**
     * 递归中虽然有限定条件，但是递归次数不能太多。否则也会发生栈内存溢出
     */
    private static void b(int i) {
        System.out.println(i);
        if(i==20000){
            return;//结束方法
        }
        b(++i);
    }


    /**
     * 递归一定要有条件限定，保证递归能够停止下来，否则会发生栈内存溢出
     * 11420
     *      Exception in thread "main" java.lang.StackOverflowError
     */
    private static void a() {
        System.out.println("a()");
        a();
    }
}
