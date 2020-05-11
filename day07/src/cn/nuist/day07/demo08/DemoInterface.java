package cn.nuist.day07.demo08;

import java.util.ArrayList;
import java.util.List;

public class DemoInterface {

    public static void main(String[] args) {
        //左边是接口名称，右边是实现类名称，这是多态写法
        List<String> list = new ArrayList<>();
        List<String> result = addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<String> addNames(List<String> list) {
        list.add("sb1");
        list.add("sb2");
        list.add("sb3");
        return list;
    }

}
