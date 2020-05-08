package cn.nuist.day05.demo09This;

/*
super关键字用来访问父类内容
this 关键字用来访问本来内容

this的用法有三种：
    1.在本类的成员方法中，访问本类的成员变量
    2.在本类的成员方法中，访问本类的另一个成员方法
    3.在本类的构造方法中，访问本类的另一个构造方法
        注意：1.与super()相似，this(...)也必须是构造方法的第一个语句
             2.super()和this()不能同时使用，因为他们各自都必须是唯一的

 */
public class Zi extends Fu{

    int num = 20;

    public Zi() {
//        super(); //这一行不再赠送
        this(1); //本类的无参构造，调用本类的有参构造
    }

    public Zi(int n) {

    }

    public void showNum() {
        int num = 10;
        System.out.println(num); //局部变量10
        System.out.println(this.num); //本类的成员变量20
        System.out.println(super.num); //父类中的成员变量30
    }

    public void methodA() {
        System.out.println("aaa");
    }

    public void methodB() {
        this.methodA(); //强调methodA来自本类，而不是父类
        System.out.println("bbb");
    }
}
