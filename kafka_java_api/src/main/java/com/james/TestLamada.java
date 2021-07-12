package com.james;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestLamada {
    //计算机俱乐部
    private static List<Student> computerClub = Arrays.asList(
            new Student("2015134001", "小明", 15, "1501"),
            new Student("2015134006", "小张", 15, "1501"),
            new Student("2015134003", "小王", 14, "1503"),
            new Student("2015134008", "小梁", 17, "1505")
    );
    //篮球俱乐部
    private static List<Student> basketballClub = Arrays.asList(
            new Student("2015134012", "小c", 13, "1503"),
            new Student("2015134013", "小s", 14, "1503"),
            new Student("2015134015", "小d", 15, "1504"),
            new Student("2015134018", "小y", 16, "1505")
    );
    //乒乓球俱乐部
    private static List<Student> pingpongClub = Arrays.asList(
            new Student("2015134022", "小u", 16, "1502"),
            new Student("2015134021", "小i", 14, "1502"),
            new Student("2015134026", "小m", 17, "1504"),
            new Student("2015134027", "小n", 16, "1504")
    );

    private static List<List<Student>> allClubStu = new ArrayList<>();

    public static void main(String[] args) {

        NoReturnOneParam lambda5 = (a, b) -> Integer.parseInt(a+b);
        lambda5.method("a", 2);
//        Map<String, Student> collect = computerClub.stream().collect(Collectors.toMap(Student::getId, Function.identity()));
//        collect.forEach((key,value)-> System.out.println(key + "=" + value));



    }
}
