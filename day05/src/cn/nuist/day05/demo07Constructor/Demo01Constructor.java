package cn.nuist.day05.demo07Constructor;

/*
继承关系中，父子类构造方法的访问特点：
    1.子类构造方法中有一个默认隐含的"super();"调用，所以一定是先调用的父类的构造方法，后执行子类的构造方法
    2.子类构造可以通过super关键字调用父类重载构造
    3.super的父类构造调用，必须是子类构造方法的【第一个】语句，且一个子类构造方法只能调用一次super

总结：
    子类构造方法必须调用父类构造方法，不写则赠送一个super();写了则用自己的，且只用一个，必须写在第一行。
 */
public class Demo01Constructor {

    public static void main(String[] args) {
        Zi zi = new Zi();
        //父类构造方法
        //子类构造方法


    }
}
