package cn.nuist.day03.demo04ArrayList;

import java.util.ArrayList;

/*
数组的长度不可以发生改变
而ArrayList的长度可以改变

对于ArrayList来说，有一个尖括号<E>代表泛型
泛型：装在集合中的所有元素，全都是统一的什么类型
注意：泛型只能是引用类型，不能是基本类型

注意事项：
    对于ArrayList集合来说，直接打印出来的不是地址值，而是内容
    如果内容为空，得到的是：[]

 */
public class Demo02ArrayList {

    public static void main(String[] args) {
        //创建了一个ArrayList集合，集合的名称是list，里面装的全都是String类型数据
        //注：从jdk1.7开始，右侧的尖括号内部可以不写内容，但<>本身要写
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); //[]

        //向集合中添加数据，需要用到add方法
        list.add("sb");
        System.out.println(list); //[sb]

        list.add("sbsb");
        list.add("sb龙狗");
        list.add("龙狗sb");
        System.out.println(list); //[sb, sbsb, sb龙狗, 龙狗sb]
    }

}
