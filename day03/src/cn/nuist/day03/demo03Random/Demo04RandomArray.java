package cn.nuist.day03.demo03Random;

import java.util.Random;

/*
问题描述：生成一个长度为10个数组，其中数组元素为范围2~10的整数
2~10:(0~8)+2
 */
public class Demo04RandomArray {

    public static void main(String[] args) {

        int[] array = new int[10];
        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            int num = (r.nextInt(9)  + 2);
            array[i] = num;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


}
