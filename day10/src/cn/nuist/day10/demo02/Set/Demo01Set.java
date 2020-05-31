package cn.nuist.day10.demo02.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
java.util.Set接口：
    public interface Set<E> extends Collection<E>
Set接口的特点：
    1.不允许存放重复元素
    2.没有索引，所以也没有带索引的方法，不能使用普通的for循环遍历

java.util.HashSet 集合 implements Set 接口
HashSet特点：
    1.不允许存放重复元素
    2.没有索引，没有带索引的方法，不能使用普通的for循环遍历
    3.是一个无序的集合，存储元素和取出元素的顺序可能不一致
    4.底层是一个哈希表结构（查询速度非常快）


 */
public class Demo01Set {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); //没有存进去

        // 使用迭代器遍历
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 使用增强for循环遍历
        System.out.println("===============");
        for(Integer i : set) {
            System.out.println(i);
        }
    }

}
