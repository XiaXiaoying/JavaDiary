package cn.nuist.day08.demo01;

/*
java.util.Arrays包中有一个public static String toString(数组)，按照默认格式：[元素1, 元素2, 元素3...]
    与Object类中的toString()方法并非继承关系
java.lang.Object包中有一个public String toString()，返回的是：对象所在的类@对象的地址值

 */
public class Demo02ToString {

    public static void main(String[] args) {
        Person one = new Person();
        System.out.println(one.toString());
    }

}
