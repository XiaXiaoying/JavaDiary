package cn.nuist.day02.demo03Encapsulation;
/*
问题描述：定义Person的年龄时，无法阻止不合理的数据
解决方法：用private关键字修饰需要保护的成员变量

一旦使用了private进行修饰，那么本类中仍然可以随意访问
【但是】超出本类范围就不能直接访问了（xx.xx）

间接访问private成员变量，就是定义一对Getter/Setter方法
 */
public class Person {

    String name;
    private int age;

    public void show() {
        System.out.println("我叫：" + name);
        System.out.println("我今年" + age + "岁了");
    }

    //这个成员方法，专门用来设置age数据
    public void setAge(int num) {
        if (num < 100 && age > 0) {
            age = num;
        } else {
            System.out.println("年龄不合理！");
        }
    }

    //这个成员方法，专门用来获取age数据
    public int getAge() {
        return age;
    }
}
