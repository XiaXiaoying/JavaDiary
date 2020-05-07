package cn.nuist.day04.demo02;

import java.util.Scanner;

/*
问题描述：
    键盘输入一个字符串，并且统计其中各种字符出现的次数
    种类有：大小写字母，数字，其他

分析：
    需要对字符串一个字一个字检查：String --> char[]，方法是toCharArray()
 */
public class Demo07StringPracticeCount {

    public static void main(String[] args) {

        int capitalLetter = 0, lowerLetter = 0, number = 0, others = 0;
        System.out.print("请输入字符串：");
        String str = new Scanner(System.in).next();
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                lowerLetter++;
            } else if (chars[i] >='A' && chars[i] <= 'Z') {
                capitalLetter++;
            } else if (chars[i] >='0' && chars[i] <='9') {
                number++;
            } else {
                others++;
            }
        }

        System.out.println("大写字母：" + capitalLetter);
        System.out.println("小写字母：" + lowerLetter);
        System.out.println("数字：" + number);
        System.out.println("其他：" + others);
    }
}
