package cn.nuist.day06.demo03;

public interface MyInterfaceA {

    public abstract void methodA();

    public abstract void methodCommon();

    public default void methodDefault() {
        System.out.println("这是接口A的默认方法");
    }
}
