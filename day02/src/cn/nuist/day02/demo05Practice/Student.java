package cn.nuist.day02.demo05Practice;
/*
一个标准的类通常拥有下面四个组成部分
    1.所有成员变量都要用private关键字修饰
    2.为每一个成员变量编写一对Getter/Setter方法
    3.编写一个无参数的构造方法
    4.编写一个全参数的构造方法

这样标准的类也称为Java Bean
 */
public class Student {

    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
