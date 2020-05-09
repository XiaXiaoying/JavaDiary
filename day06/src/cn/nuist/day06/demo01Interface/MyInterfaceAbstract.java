package cn.nuist.day06.demo01Interface;


/*
在任何版本的Java中，接口都能定义抽象方法：
    public abstract 返回值类型 方法名称(参数列表);
    注意事项：
        1.接口中的抽象方法，修饰符必须是两个固定的关键字：public abstract
        2.这两个关键字修饰符，可以选择性的省略
 */
public interface MyInterfaceAbstract {


    //以下四种定义方式完全等价
    public abstract void methodAbs();

    public void methodAbs2();

    abstract void methodAbs3();

    void methodAbs4();

}
