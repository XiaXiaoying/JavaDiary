package cn.nuist.day06.demo01Interface;


/*
注意事项：不能通过接口实现类的对象来调用接口中的静态方法
正确用法：通过接口名称直接调用静态方法
    接口名称.静态方法名(参数)
 */
public class Demo03Interface {

    public static void main(String[] args) {
        //创建了实现类对象
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();

        //错误写法！
//        impl.methodStatic();

        //直接通过接口名称直接调用静态方法
        MyInterfaceStatic.methodStatic();
    }

}
