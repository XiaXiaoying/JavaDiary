package cn.nuist.day06.demo03;


/*
这个子接口中有4个抽象方法：
    methodA() 来自于MyInterfaceA
    methodB() 来自于MyInterfaceB
    methodCommon() 来自于MyInterfaceA和MyInterfaceB
    method() 来自于我自己MyInterface
 */
public interface MyInterface extends MyInterfaceA, MyInterfaceB {

    public abstract void method();

    @Override
    default void methodDefault() {
        System.out.println("这是Override的默认方法");
    }

}
