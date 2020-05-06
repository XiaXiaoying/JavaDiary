package cn.nuist.day03.demo01Scanner;


import java.util.Scanner;

/*
问题描述：键盘输入两个int，求和
 */
public class Demo02ScannerSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个数字：");
        int num1 = sc.nextInt();
        System.out.print("请输入第二个数字：");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("和是：" + sum);
    }
}
