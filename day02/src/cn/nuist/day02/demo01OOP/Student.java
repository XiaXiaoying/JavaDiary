package cn.nuist.day02.demo01OOP;
/*
定义一个学生类，模拟学生的行为
属性（成员变量）：
    姓名
    年龄
行为（成员方法）：
    吃饭
    睡觉
    学习

成员变量：
    String name;
    int age;
成员方法：
    public void eat() {}
    public void sleep() {}
    public void study() {}

注意事项：
    1.成员变量是直接定义在类中的，在方法外面
    2.成员方法不要写static关键字
 */
public class Student {

    //成员变量
    String name;
    int age;

    //成员方法
    public void eat() {
        System.out.println("吃饭饭");
    }

    public void sleep() {
        System.out.println("睡觉觉");
    }

    public void study() {
        System.out.println("学习");
    }
}
