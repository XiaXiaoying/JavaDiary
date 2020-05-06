package cn.nuist.day03.demo01Scanner;

import java.util.Scanner;
/*
Scanner类的功能：从键盘读取输入

引用类型的使用步骤：
    1.导包
        import 包路径.类名称
        如果需要使用的类和当前类在同一个包下，则可省略
        只有java.lang下的包无需导包，其他都需要
    2.创建
        类名称 对象名 = new 类名称();
    3.使用
        对象名.成员方法名();
 */
public class Demo01Scanner {

    public static void main(String[] args) {
        //System.in代表从键盘输入
        Scanner sc = new Scanner(System.in);

        //获取输入的数字
        int num = sc.nextInt();
        System.out.println("输入的数字是：" + num);

        //获取输入的字符串
        String str = sc.next();
        System.out.println("输入的字符串是：" + str);
    }
}
