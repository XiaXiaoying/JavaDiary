package cn.nuist.day06.demo03;

public interface MyInterfaceB {

    public abstract void methodB();

    public abstract void methodCommon();

    public default void methodDefault() {
        System.out.println("这是接口B的默认方法");
    }

}
