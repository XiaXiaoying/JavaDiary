package cn.nuist.day05.demo01Inheritance;

/*
在继承的关系中，子类就是一个父类，即子类可以被当成父类看到
例如父类是Person，子类是Student，那么”Student是一个Person“。关系：is-a

定义父类的格式：（一个普通的类定义）
    public class 父类名称 {
        //...
    }

定义子类的格式：
    public class 子类名称 extends 父类名称 {
        //...
    }


 */
public class Demo01Extends {

    public static void main(String[] args) {

        //创建了一个子类对象
        Teacher teacher = new Teacher();
        //Teacher类可以调用父类Employee类中的方法
        teacher.method();

        //创建了另一个子类对象
        Assistant assistant = new Assistant();
        assistant.method();
    }
}
