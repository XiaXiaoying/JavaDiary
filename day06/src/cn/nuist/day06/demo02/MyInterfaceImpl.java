package cn.nuist.day06.demo02;

public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB {

    @Override
    public void methodA() {
        System.out.println("实现了A方法！");
    }

    @Override
    public void methodB() {
        System.out.println("实现了B方法！");
    }

    @Override
    public void methodAbs() {
        System.out.println("实现了A和B同样的抽象方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("覆盖重写了A和B同样的默认方法");
    }

}
