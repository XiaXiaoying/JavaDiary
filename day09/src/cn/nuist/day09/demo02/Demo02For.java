package cn.nuist.day09.demo02;

import java.util.ArrayList;
import java.util.Collection;

/*
增强型for循环：用来遍历集合和数组（只能遍历）
    底层使用的就是迭代器，只是使用for循环的格式，简化了迭代器的书写。
    是JDK1.5之后的新特性
    public interface Collection<E> extends Iterable<E>：所有的单列集合都可以使用增强for循环
    public interface Iterable<T>：实现此接口允许对象成为“for-each loop”语句的目标。

    格式：
        for(集合/数组中元素的数据类型 变量名: 集合名/数组名){
            sout(变量名)
        }
 */
public class Demo02For {

    public static void main(String[] args) {
        demo01();
        demo02();
    }

    private static void demo01() {
        int[] arr = {1, 2, 3, 4, 5};
        for(int i: arr) {
            System.out.println(i);
        }
    }

    private static void demo02() {
        Collection<String> coll = new ArrayList<>();
        coll.add("a1");
        coll.add("a2");
        coll.add("a3");
        for(String str: coll) {
            System.out.println(str);
        }
    }


}
