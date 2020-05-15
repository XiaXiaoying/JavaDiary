package cn.nuist.day08.demo04Calendar;

import java.util.Calendar;

/*
java.util.Calendar类：日历
    Calendar类是一个抽象类，里面提供了很多操作日历字段的方法
    Calendar类无法直接创建对象使用，里面有一个静态方法叫getInstance()，返回Calendar类的子类对象：
        static Calendar getInstance()


 */
public class Demo01Calendar {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(); //多态
        System.out.println(calendar);

    }

}
