package com.james.timer;

import java.util.*;

public class TimerTest  {

    public static void main(String[] args) {


        System.out.println("1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("2");

    }

    public int getNum(){
        try{
            int a = 1/0;
            return 1;
        }catch (Exception e){
            return 2;
        }finally{
            return 3;
        }
    }

}
