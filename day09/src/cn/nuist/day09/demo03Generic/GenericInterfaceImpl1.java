package cn.nuist.day09.demo03Generic;

/*
含有泛型的接口，有两种使用方式：
    1.定义接口的实现类，实现接口，并指定接口的泛型，如下
    2.接口使用什么泛型，实现类就使用什么泛型
 */
public class GenericInterfaceImpl1 implements GenericInterface<String>{
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
