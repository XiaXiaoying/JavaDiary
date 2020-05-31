package cn.nuist.day10.demo02.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
    java.util.LinkedHashSet集合： extends HashSet集合
    LinkedHashSet集合特点：
        底层是一个哈希表（数组+链表/红黑树） + 链表：多了一个链表结构，保证元素有序
 */
public class Demo04LinkedHashSet {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("abc");
        set.add("222");
        set.add("www");
        System.out.println(set); // [222, abc, www] 无序且不重复

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("abc");
        linked.add("abc");
        linked.add("222");
        linked.add("www");
        System.out.println(linked); // [abc, 222, www] 有序且不重复
    }

}
