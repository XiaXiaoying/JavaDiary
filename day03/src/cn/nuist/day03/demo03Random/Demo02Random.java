package cn.nuist.day03.demo03Random;

import java.util.Random;
import java.util.Scanner;

/*
题目要求：根据int n的值，获取随机数字，范围是[1,n]
 */
public class Demo02Random {

    public static void main(String[] args) {
        System.out.print("请输入范围：");
        int n = new Scanner(System.in).nextInt();

        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println("生成的随机数是" + (r.nextInt(n) + 1));
        }

    }

}
