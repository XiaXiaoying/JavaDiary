package cn.nuist.day09.demo03Generic;

import java.util.ArrayList;
import java.util.Collection;

/*
泛型的上限限定：? extends E 代表使用的泛型只能是E类型的子类/本身
泛型的下限限定：? super E   代表使用的泛型只能是E类型的父类/本身
 */
public class Demo06Generic {

    public static void main(String[] args) {
        //Integer extends Number extends Object
        //String extends Object
        Collection<Integer> list1 = new ArrayList<>();
        Collection<String> list2= new ArrayList<>();
        Collection<Number> list3 = new ArrayList<>();
        Collection<Object> list4 = new ArrayList<>();

        getElement1(list1);
//        getElement1(list2); //报错
        getElement1(list3);
//        getElement1(list4); //报错

//        getElement2(list1); //报错
//        getElement2(list2); //报错
        getElement2(list3);
        getElement2(list4);
    }

    public static void getElement1(Collection<? extends Number> coll) {}
    public static void getElement2(Collection<? super Number> coll) {}
}
