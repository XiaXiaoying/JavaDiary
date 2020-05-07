package cn.nuist.day03.demo04ArrayListPractice;

import java.util.ArrayList;
import java.util.Random;

/*
问题描述：
    用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合中
    要求使用自定义方法筛选
 */
public class Demo04ArrayListReturn {

    public static void main(String[] args) {

        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(100) + 1);
        }
        System.out.println("大集合：" + list);
        System.out.println("小集合：" + sort(list));
    }

    public static ArrayList<Integer> sort (ArrayList<Integer> list) {

        ArrayList<Integer> even = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                even.add(list.get(i));
            }
        }
        return even;
    }

}
