package com.company;

import java.util.concurrent.Callable;

public class Main {
    public static void  main (String[] args){
         Class Class = new Class (12, "moskow",new int[]{4,6,7,6});
        System.out.println(Class.getNomer());
        System.out.println(Class.getSoz());
        for (int a: Class.getMassiv()){
            System.out.print(a+" ");
        }
    }
}
