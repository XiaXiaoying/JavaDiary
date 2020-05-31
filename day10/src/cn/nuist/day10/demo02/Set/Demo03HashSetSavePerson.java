package cn.nuist.day10.demo02.Set;

import java.util.HashSet;

/*
    HashSet存储自定义类型元素

    Set集合保证元素唯一：
        存储的元素（String, Integer, Stundent, ...），必须重写hashCOde方法和equals方法

    要求：
        同名同年龄的人，视为同一人，只能存储一次
 */
public class Demo03HashSetSavePerson {

    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("lzn", 18);
        Person p2 = new Person("lzn", 18);
        Person p3 = new Person("lzn", 100);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }

}
