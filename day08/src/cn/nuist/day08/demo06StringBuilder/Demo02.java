package cn.nuist.day08.demo06StringBuilder;

/*
StringBuilder类中的常用方法：
    1.public StringBuilder apped(...)：添加任意类型数据的字符串形式，并返回当前对象自身

 */
public class Demo02 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //append()方法返回的是this，即调用方法的对象
//        StringBuilder sb2 = sb.append("abc");
//        System.out.println(sb); //abc
//        System.out.println(sb2); //abc
//        System.out.println(sb == sb2); //true

        //使用append()方法无需返回值
//        sb.append("abc");
//        sb.append(1);
//        sb.append(true);
//        sb.append('中');
//        sb.append(1.1);
//        System.out.println(sb); //abc1true中1.1

        /*
            链式编程：方法返回值是一个对象，可以继续调用方法
         */
        sb.append("aaa").append(111).append(true);
        System.out.println(sb);

    }

}
