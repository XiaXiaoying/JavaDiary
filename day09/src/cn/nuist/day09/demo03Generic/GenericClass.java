package cn.nuist.day09.demo03Generic;

/*
定义一个含有泛型的类，模拟ArrayList集合
不确定用什么数据类型时，用泛型
泛型可以接受任意数据类型
创建对象时才确定泛型的数据类型
 */
public class GenericClass<E> {

    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }


}
