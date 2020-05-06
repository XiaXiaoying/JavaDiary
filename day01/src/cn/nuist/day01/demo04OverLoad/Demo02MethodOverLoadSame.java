package cn.nuist.day01.demo04OverLoad;

import static java.lang.Math.abs;

public class Demo02MethodOverLoadSame {

    public static void main(String[] args) {
        double a = 0.1, b =0.1;
        int x = 2, y = 3;
        System.out.println(isSame(a, b));
        System.out.println(isSame(x, y));
    }

    public static boolean isSame(byte a, byte b) {
        return a == b;
    }

    public static boolean isSame(int a, int b) {
        return a == b;
    }

    public static boolean isSame(double a, double b) {
        boolean same;
        if (abs(a - b) < 0.00001) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }

}