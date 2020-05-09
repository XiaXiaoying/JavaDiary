package cn.nuist.day06.demo01Interface;

public class MyInterfaceDefaultA implements MyInterfaceDefault {

    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法AAA");
    }

    @Override
    public void methodDefault() {
        System.out.println("实现类A覆盖重写了抽象类的默认方法");
    }
}
