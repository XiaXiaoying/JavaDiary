package cn.nuist.day04.demo05Math;

/*
java.util.Math类是数学相关的工具类，提供了大量静态方法，完成与数学运算相关的操作

public static double abs(double num)：获取绝对值
public static double ceil(double num)：向上取整
public static double floor(double num)：向下取整
public static long round(double num)：四舍五入

Math.PI: public static final double PI = 3.141592653589793D;
 */
public class Demo01Math {

    public static void main(String[] args) {

        //绝对值
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-3.14));
        System.out.println("=====================");

        //向上取整
        System.out.println(Math.ceil(3.9)); //4.0
        System.out.println(Math.ceil(3.1)); //4.0
        System.out.println(Math.ceil(3.0)); //3.0
        System.out.println("=====================");

        //向下取整
        System.out.println(Math.floor(3.9)); //3.0
        System.out.println(Math.floor(3.1)); //3.0
        System.out.println(Math.floor(3.0)); //3.0
        System.out.println("=====================");

        //四舍五入
        System.out.println(Math.round(22.4)); //22
        System.out.println(Math.round(22.5)); //23

    }
}
