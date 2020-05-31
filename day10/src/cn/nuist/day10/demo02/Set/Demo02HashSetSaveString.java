package cn.nuist.day10.demo02.Set;

import java.util.HashSet;

/*
    Set集合不允许存放重复元素的原理：
        1.先调用hashCode方法，看哈希表中有没有该哈希值，如果没有，则存入；如果有，则进入2
        2.调用equals方法，如果返回true，则认定两个元素相同，不存；如果返回false，则存入
    注意：
        String类重写了equals方法，比较的是字符串的内容
 */
public class Demo02HashSetSaveString {

    public static void main(String[] args) {
        // 创建HashSet集合对象
        HashSet<String> set = new HashSet<>();
        String s1 = "abc";
        String s2 = new String("abc");
        set.add(s1);
        set.add(s2);
        System.out.println(s1.equals(s2));
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set); // [重地, 通话, abc]

    }
}
