package cn.nuist.day03.demo04ArrayList;

import java.util.ArrayList;

public class Demo04ArrayListEach {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("sb1");
        list.add("sb2");
        list.add("sb3");

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
