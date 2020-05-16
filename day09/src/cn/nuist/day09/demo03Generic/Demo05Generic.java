package cn.nuist.day09.demo03Generic;

import java.util.ArrayList;
import java.util.Iterator;

/*
泛型的通配符：
    ?：代表任意的数据类型
使用方法：
    不能创建对象使用
    只能作为方法的参数使用
 */
public class Demo05Generic {

    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("abc");
        list02.add("eee");

        printArray(list01);
        printArray(list02);

//        ArrayList<?> list01 = new ArrayList<>(); //错误！不能创建对象使用
    }

    //定义一个方法，遍历所有类型的ArrayList集合
    //这时我们不知道ArrayList使用什么数据类型，可以使用泛型的通配符?来接收
    //注意：泛型是没有继承概念的
    public static void printArray(ArrayList<?> list) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
        }

    }
}
