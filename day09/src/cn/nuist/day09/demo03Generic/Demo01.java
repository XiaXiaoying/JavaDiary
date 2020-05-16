package cn.nuist.day09.demo03Generic;

import java.util.ArrayList;
import java.util.Iterator;

/*
泛型：一种未知的数据类型，即我们不知道用什么数据类型的时候，就用泛型。
 */
public class Demo01 {

    public static void main(String[] args) {
        show01();
        show02();
    }

    /*
        创建集合对象，不使用泛型
        好处：
            集合不适用泛型，默认的类型就是Object，可以存储任意数据类型
        坏处：
            不安全，会引发异常
     */
    private static void show01() {
        ArrayList list = new ArrayList();
        list.add("ab");
        list.add(1);

        //使用迭代器遍历集合
        Iterator it = list.iterator();
        while (it.hasNext()) {
            //取出的数据类型也是Object
            Object obj = it.next();
            System.out.println(obj);

            //如果想使用String类特有的length()方法，则不行
            //因为现在使用的是多态：Object obj = "abc";
            //需要向下转型，对于"abc"，正常。对于1，抛出ClassCastException
//            String s = (String) obj;
//            System.out.println(s.length());
        }
    }

    /*
        创建集合对象，使用泛型
        好处：
            1.避免了类型转换的麻烦
            2.把运行时异常（运行了才会抛出的异常），提升到了编译时（写代码的时候就会抛出）
        坏处：
            泛型是什么，就只能存储什么类型的数据
     */
    private static void show02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
//        list.add(1); //编译时报错

        //使用迭代器遍历list集合
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s.length());
        }
    }

}
