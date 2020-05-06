package cn.nuist.day03.demo01Scanner;

import java.util.Scanner;

/*
问题描述：键盘输入三个数字，求其最大值
 */
public class Demo03ScannerMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个数字");
        int num1 = sc.nextInt();
        System.out.print("请输入第二个数字");
        int num2 = sc.nextInt();
        System.out.print("请输入第三个数字");
        int num3 = sc.nextInt();
        int max = num1;
        if(max < num2) {
            max = num2;
        }
        if(max < num3) {
            max = num3;
        }
        System.out.println("最大值为：" + max);
    }
}
