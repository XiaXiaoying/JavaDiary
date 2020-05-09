package cn.nuist.day06.demo02;

public interface MyInterfaceB {

    public abstract void methodB();

    public abstract void methodAbs();

    public default void methodDefault() {
        System.out.println("这是接口B中的默认方法");
    }

}
