package cn.nuist.day09.demo02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
java.util.Iterator接口：迭代器
常用方法：
    boolean hasNext()：如果仍有元素可以迭代，返回true
    E next()：返回迭代的下一个元素
注意：
    Iterator迭代器是一个接口，无法直接使用，需要new实现类对象，获取实现类的方法：
        Collection接口中有一个方法，叫Iterator<E> iterator()  ，这个方法返回一个迭代器对象

迭代器的使用步骤【重点】：
    1.使用集合中的方法iterator()方法获取迭代器的实现类对象，使用Iterator接口接收（多态）
    2.使用Iterator接口中的hasNext()方法判断还有没有下一个元素
    3.使用Iterator接口中的next()方法取出集合中的下一个元素

迭代器的原理：
    1.创建迭代器对象时，创建了一个指针，指向集合中的 -1 号元素
    2.hasNext()方法，判断当前指针下一个元素(0 号元素)是否为空，并返回
    3.next()方法：
        1.取出当前指针指向的下一个元素(0 号元素)
        2.将指针指向下一个元素(0 号元素)

 */
public class Demo01Iterator {

    public static void main(String[] args) {
        //创建一个集合对象
        Collection<String> coll = new ArrayList<>();
        //向集合中添加对象
        coll.add("a1");
        coll.add("a2");
        coll.add("a3");
        coll.add("a4");
        coll.add("a5");

        //使用Collection中的iterator()方法获取一个迭代器的实现类对象
        //注意：Iterator<E>也是有泛型的，迭代器的泛型跟着集合走
        //多态：左边是接口，右边是实现类对象
        Iterator<String> it = coll.iterator();

        //使用Iterator接口中的hasNext()方法判断还有没有下一个元素
        //使用Iterator接口中的next()方法取出集合中的下一个元素
        while (it.hasNext() == true) {
            System.out.println(it.next());
        }


    }

}
