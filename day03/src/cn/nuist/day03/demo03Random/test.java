package cn.nuist.day03.demo03Random;

import java.util.Scanner;
/*

 */
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(reverse(x));

    }
    public static int reverse(int x){
        int res = 0 ;
        while(x != 0){
            int temp = x % 10 + res * 10;
            System.out.println("res = " + res);
            System.out.println("(temp - x % 10) / 10 = " + ((temp - x % 10) / 10));
            if((temp - x % 10) / 10 != res){ //最关键的一步
                return 0 ;
            }
            res = temp ;
            x /= 10 ;
        }
        return res ;
    }
}
