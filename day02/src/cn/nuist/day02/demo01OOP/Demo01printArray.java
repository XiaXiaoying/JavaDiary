package cn.nuist.day02.demo01OOP;

import java.util.Arrays;

/*
面向过程：每一步都自己做
面向对象：找人帮我做
 */
public class Demo01printArray {
    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };

        //面向过程
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i == array.length - 1) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("==================");

        //面向对象
        System.out.println(Arrays.toString(array));
    }
}
