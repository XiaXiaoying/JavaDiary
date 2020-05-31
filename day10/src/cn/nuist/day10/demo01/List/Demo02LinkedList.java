package cn.nuist.day10.demo01.List;

import java.util.LinkedList;

/*
    java.util.LinkedList集合：implements List
    LinkedList集合的特点：
        1.底层是一个链表结构：查询快，增删慢
        2.里面包含了大量操作首尾元素的方法
        注意：使用特有方法，不能使用多态

        void addFirst(E e) 在该列表开头插入指定的元素。
        void addLast(E e) 将指定的元素追加到此列表的末尾。
        void push(E e)  将元素推送到由此列表表示的堆栈上。
        E pop()  从此列表表示的堆栈中弹出一个元素。
        E getFirst()  返回此列表中的第一个元素。
        E getLast()  返回此列表中的最后一个元素。
        E removeFirst()  从此列表中删除并返回第一个元素。
        E removeLast()  从此列表中删除并返回最后一个元素。
        boolean isEmpty()  如果此列表不包含元素，则返回 true 。 （属于父类List）

 */
public class Demo02LinkedList {


    public static void main(String[] args) {
        show01();
        show02();
        show03();
    }

    private static void show01() {

        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked); // [a, b, c]

        // void addFirst(E e) 在该列表开头插入指定的元素。
        linked.addFirst("lzn");
        System.out.println(linked);

        // void push(E e)  将元素推送到由此列表表示的堆栈上
        // 等效于addFirst()
        linked.push("dashabi");
        System.out.println(linked);

        // void addLast(E e) 将指定的元素追加到此列表的末尾。
        // 等效于add()
        linked.add("d");
        System.out.println(linked);
        System.out.println("===============");

    }

    private static void show02() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

        // 清空所有元素
//        linked.clear();

        if (!linked.isEmpty()) {
            String first = linked.getFirst();
            String last = linked.getLast();
            System.out.println("first: " + first + ", last: " + last);
        }
        System.out.println("===============");
    }

    private static void show03() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");
        System.out.println(linked);

        // 下面三个方法完全等价
        linked.remove();
        System.out.println(linked);
        linked.removeFirst();
        System.out.println(linked);
        String first = linked.pop();
        System.out.println("first: " + first + ", list: " + linked);


        // E removeLast()  从此列表中删除并返回最后一个元素。
        String last = linked.removeLast();
        System.out.println("last: " + last + ", list: " + linked);
    }


}
