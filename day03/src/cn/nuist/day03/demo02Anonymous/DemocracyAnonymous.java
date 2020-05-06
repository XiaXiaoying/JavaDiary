package cn.nuist.day03.demo02Anonymous;

import java.util.Scanner;

public class DemocracyAnonymous {

    public static void main(String[] args) {
        //普通使用方式
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        //匿名对象的方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的是：" + num);

        //使用一般写法传入参数
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);

        //使用匿名对象传参
//        methodParam(new Scanner(System.in));

        Scanner scanner = methodReturn();
        int i = scanner.nextInt();
        System.out.println("输入的是：" + i);
    }

    public static void methodParam(Scanner sc) {
        int i = sc.nextInt();
        System.out.println("输入的是：" + i);
    }

    public static Scanner methodReturn() {
        return new Scanner(System.in);
    }

}
