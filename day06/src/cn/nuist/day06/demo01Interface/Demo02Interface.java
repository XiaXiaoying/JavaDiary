package cn.nuist.day06.demo01Interface;
/*
1.接口的默认方法，可以通过接口实现类对象直接调用
2.接口的默认方法，也可以被接口实现类进行覆盖重写
 */
public class Demo02Interface {

    public static void main(String[] args) {

        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs(); //调用抽象方法，实际运行的是实现类
        //实现了抽象方法AAA
        a.methodDefault(); //调用默认方法，如果实现类中没有，则会向上找接口的
        //实现类A覆盖重写了抽象类的默认方法

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        //实现了抽象方法BBB
        b.methodDefault();
        //这是新添加的默认方法
    }

}
