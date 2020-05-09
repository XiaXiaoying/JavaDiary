package cn.nuist.day06.demo02;

/*
使用接口时，需要注意：
    1.接口是没有静态代码块或构造方法的
    2.一个类的直接父类是唯一的，但是一个类可以同时实现多个接口
        格式：
             public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB {
                //覆盖重写接口A和B的所有抽象方法
             }
    3.如果实现类所实现（Override）的多个接口中，存在重复的抽象方法，那么只需要实现一个即可
    4.如果实现类没有实现（Override）所有抽象方法，那么该实现类必须是一个抽象类
    5.如果实现类实现的多个接口中存在重复的默认方法，那么实现类必须覆盖重写（Override）重复的默认方法
    6.一个类如果直接父类中的方法，和接口中的默认方法产生了冲突，那么默认使用父类中的方法
 */
public class Demo01Interface {

    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method(); //父类方法
    }

}
