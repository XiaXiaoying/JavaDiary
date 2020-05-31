package cn.nuist.day10.demo01.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
java.util.list接口：
    public interface List<E> extends Collection<E>
list接口的特点：
    1.有序，存储元素和取出元素的顺序是一致的（存储时123，取出时也是123）
    2.有索引，包含一些带索引的方法
    3.允许存储重复元素

list接口中的带索引方法：
    void add(int index, E element) // 与Collection接口中定义的add方法不是一个
    E remove(int index)
    E get(int index)
    E set(int index, E element)
    boolean isEmpty()  如果此列表不包含元素，则返回 true 。
    注意：使用时，一定要注意索引越界
 */
public class Demo01List {

    public static void main(String[] args) {

        //创建一个list集合对象，使用多态
        List<String> list = new ArrayList<>();

        // boolean add(E element)
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        System.out.println(list); //重写了toString()方法

        // void add(int index, E element)
        list.add(2,"111"); //在索引为2处添加元素
        System.out.println(list);

        // E remove(int index)
        String removed = list.remove(2); // 移除了下标为2的元素，返回被移除的元素
        System.out.println("removed: " + removed);
        System.out.println(list);

        // E set(int index, E element)
        String replaced = list.set(3, "A");
        System.out.println("replaced: " + replaced);
        System.out.println(list);

        // List的遍历方法
        // 1.普通for循环
        System.out.println("================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("================");

        // 2.增强for循环：最简单
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println("================");

        // 3.迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
