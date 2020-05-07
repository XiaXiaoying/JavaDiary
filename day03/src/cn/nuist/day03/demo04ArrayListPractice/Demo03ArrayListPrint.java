package cn.nuist.day03.demo04ArrayListPractice;

import java.util.ArrayList;

public class Demo03ArrayListPrint {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("sb1");
        list.add("sb2");
        list.add("sb3");
        list.add("sb4");
        System.out.println(list);
        print(list);
    }

    public static void print(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + "@");
            }
        }
        System.out.println("}");
    }
}
