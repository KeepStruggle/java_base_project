package com.james;

import com.sun.xml.internal.ws.org.objectweb.asm.ClassAdapter;

/**
 * @version 1.8
 * @ClassName Test01
 * @Description TODO
 * @Author James
 * @date 2021/3/6 18:09
 */
public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //通过反射获取类的的Class对象
        Class c1 = Class.forName("com.james.User");

        Class c2 = Class.forName("com.james.User");
        Class c3 = Class.forName("com.james.User");
        Class c4 = Class.forName("com.james.User");

        //一个类在内存中只有一个Class对象
        //一个类被加载后，类的整个结构都会封装在Class对象中
        //通过打印hashCode判断对象是否为同一个
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());


    }

}

class User{
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
