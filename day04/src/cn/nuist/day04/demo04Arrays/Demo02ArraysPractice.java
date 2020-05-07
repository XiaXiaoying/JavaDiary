package cn.nuist.day04.demo04Arrays;

import java.util.Arrays;

/*
问题描述：请使用Arrays相关API，将一个随机字符串中的所有字符升序排列，并倒叙打印
 */
public class Demo02ArraysPractice {

    public static void main(String[] args) {
        String str = "isduhfa645edruYDS9fdfsoUUAdsa6gn";

        //升序排列：sort
        //必须先用toCHarArray将字符串转换为字符数组
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        //倒序遍历
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i] + " ");
        }
    }
}
