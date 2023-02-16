package org.example.leson1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Home {
    public static void main(String[] args) {
        Totalizator c = new Totalizator();
        String s = "";
        c.alienate(s);
    }
}
class Totalizator<E>{
    public void alienate(E o){
        Class c = o.getClass();
        String name = c.getName();
        Field[] fields = c.getDeclaredFields();
        Method[] methods = c.getDeclaredMethods();
        System.out.println(name);
        Arrays.stream(fields).forEach(System.out::println);
        Arrays.stream(methods).forEach(System.out::println);
    }
}
