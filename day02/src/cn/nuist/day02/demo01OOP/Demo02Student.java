package cn.nuist.day02.demo01OOP;
/*
通常情况下，一个类不能直接使用，需要根据类创建对象使用
创建对象的方法：
    1.导包：指出需要使用的类在什么位置
            import 包名称.类名称;
            import cn.nuist.day02.demo01OOP.Student
            对于和当前类属于同一个包的情况，可以省略导包语句
    2.创建
            类名称 对象名 = new 类名称();
            Student stu = new Student();
    3.使用：想用谁，就用对象名.谁
            使用成员变量：对象名.成员变量名
            使用成员方法：对象名.成员方法名(参数)
    4.注意事项：
            若成员变量没有进行赋值，则会有默认值，和数组一样
 */
public class Demo02Student {
    public static void main(String[] args) {

        Student stu = new Student();
        System.out.println(stu.name);//null
        System.out.println(stu.age);//0
        System.out.println("=================");

        //使用成员变量
        stu.name = "sb";
        stu.age = 18;
        System.out.println(stu.name);//sb
        System.out.println(stu.age);//18
        System.out.println("=================");

        //使用成员方法
        stu.eat();
        stu.sleep();
    }
}
