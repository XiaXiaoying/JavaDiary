package cn.nuist.day08.demo01;

import java.util.Objects;

/*
Objects类的equals()方法：对两个对象进行比较，防止空指针异常
源代码：
        public static boolean equals(Object a, Object b) {
            return (a == b) || (a != null && a.equals(b));
        }
 */
public class Demo03Objects {

    public static void main(String[] args) {
        String s1 = null;
        String s2 = "aBc";
//        System.out.println(s1.equals(s2)); //NullPointerException，不能调用null对象的实例方法

        System.out.println(Objects.equals(s1,s2)); //false

    }

}
