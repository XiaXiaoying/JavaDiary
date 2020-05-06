package cn.nuist.day02.demo03Encapsulation;
/*
面向对象三大特征：封装（Encapsulation）、继承（Inheritance）、多态（Polymorphism）

封装性在Java中的体现：
    1.方法就是一种封装
    2.关键字private也是一种封装

封装就是将一些细节信息隐藏起来，对外界不可见
 */
public class Demo01Method {

    public static void main(String[] args) {
        int[] array = { 5, 15, 25, 35, 100 };
        System.out.println(getMax(array));

    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}
