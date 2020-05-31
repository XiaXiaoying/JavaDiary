package cn.nuist.day09.demo03Generic;

/*
含有泛型的接口，有两种使用方式：
    1.定义接口的实现类，实现接口，并指定接口的泛型
    2.接口使用什么泛型，实现类就使用什么泛型，如下
        相当于创建了一个使用泛型的类，创建对象的时候确定泛型的类型
 */
public class GenericInterfaceImpl2<I> implements GenericInterface<I>{

    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
