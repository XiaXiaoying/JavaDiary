package cn.nuist.day08.demo02;

import java.util.Date;

public class Demo02Date {

    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();

    }

    //public long getTime()
    //返回自1970 年 1 月 1 日 00：00：00到现在的毫秒值
    //相当于System.currentTimeMillis()
    private static void demo03() {
        Date date = new Date();
        System.out.println(date.getTime());
    }

    //Date类的带参构造方法，将传入的毫秒值转换为日期
    //    public Date(long date) {
    //        fastTime = date;
    //    }
    private static void demo02() {
        Date date = new Date(1589465489961L);
        System.out.println(date);
    }

    //Date类的默认构造方法，重载了带参构造，this(System.currentTimeMillis())
    public static void demo01() {
        Date date = new Date();
        System.out.println(date); //Thu May 14 22:16:06 CST 2020
    }
}
