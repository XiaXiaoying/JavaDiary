package cn.nuist.day02.demo04Constructor;
/*
构造方法是专门用来创建对象的方法，当我们通过关键字new创建对象时，其实就是在调用构造方法
格式：
    public 类名称(参数类型, 参数名称) {
        方法体
    }

注意事项：
    1.构造方法的名称必须和所在的类名称完全一样，包括大小写
    2.构造方法不要写返回值类型，连void也不写
    3.构造方法不能return返回值
    4.如果没有编写任何构造方法，编译器会默认一个构造方法：
        public Student() {}
    5.一旦编写了至少一个构造方法，那么编译器不再默认构造方法
    6.构造方法可以进行重载
 */
public class Student {

    //成员变量
    private String name;
    private int age;

    //无参构造方法
    public Student() {
        System.out.println("无参数构造方法执行了");
    }

    //有参构造方法
    public Student(String name, int age) {
        System.out.println("有参数构造方法执行了");
        this.name = name;
        this.age = age;
    }

    //Getters and Setters
    //如果需要改变name和age，仍然需要setXxx方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
