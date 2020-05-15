package cn.nuist.day08.demo07WrapperClass;

import java.util.ArrayList;

/*
自动装箱和自动拆箱：基本类型和包装类之间可以自动转换（jdk1.5新特性）

 */
public class Demo02Integer {

    public static void main(String[] args) {

        /*
            自动装箱：直接把int类型的整数赋值包装类
            Integer i1 = 1 相当于 integer i1 = new Integer(1)
         */
        Integer i1 = 1;

        /*
            自动拆箱：i1是包装类对象，无法直接参与运算，可以自动转换为基本数据类型
            i1 + 2 相当于 i1.intValue() + 2
            i1 = i1.intValue() + 2 又是一个自动装箱
         */
        i1 = i1 + 2;

        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList集合无法直接存储证书，可以存储Integer包装类
        list.add(1); //自动装箱 list.add(new Integer(1));
        int a = list.get(0); //自动拆箱，list.get(0).intValue();

    }

}
