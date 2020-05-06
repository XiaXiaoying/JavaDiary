package cn.nuist.day03.demo03Random;

import java.util.Random;
import java.util.Scanner;

/*
问题描述：猜数字小游戏
 */
public class Demo03Random {

    public static void main(String[] args) {
        int num = new Random().nextInt(100);

        System.out.print("猜一个0到99之间的数：");
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();
        int cnt = 0;

        while (guess != num) {
            if(guess > num) {
                System.out.println("大了");
                guess = sc.nextInt();
                cnt++;
            }
            else {
                System.out.println("小了");
                guess = sc.nextInt();
                cnt++;
            }
        }
        System.out.println("恭喜，猜对了,你一共用了" + cnt + "次！");
    }
}
