package cn.nuist.day05.demo10Abstract;

/*
抽象方法：就是加上abstract关键字，然后去掉大括号，直接分号结束
抽象类：抽象方法所在的类必须是抽象类

如何使用抽象类和抽象方法：
    1.不能直接new一个抽象类的对象
    2.必须用一个子类继承抽象类
    3.子类必须覆盖重写抽象父类的【所有】抽象方法
        覆盖重写：即实现，子类去掉抽象方法的abstract关键字，然后补上方法体
        注意：如果不实现抽象父类的所有抽象父类，那么子类也必须是一个抽象类
    4.创建子类对象使用

 */
public abstract class Animal {

    //这是一个抽象方法，代表吃东西，但是具体吃什么没法确定，需要交给子类来确定
    public abstract void eat();

    //这是一个普通的成员方法
    public void normalMethod() {
        System.out.println("hahaha");
    }

}
