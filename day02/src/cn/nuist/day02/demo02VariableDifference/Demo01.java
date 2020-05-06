package cn.nuist.day02.demo02VariableDifference;
/*
局部变量和成员变量的区别
    1.定义的位置不一样【重点】
        局部变量：在方法的内部
        成员变量：在方法的外部，直接写在类中

    2.作用范围不一样【重点】
        局部变量：只有在方法中可以使用
        成员变量：整个类都可以通用

    3.默认值不一样【重点】
        局部变量：没有默认值，如果想要使用，必须手动赋值
        成员变量：如果没有赋值，则会有默认值，规则同数组

    4.内存的位置不一样
        局部变量：位于栈内存中
        成员变量：位于堆内存中

    5.生命周期不一样
        局部变量：随着方法进栈被创建，随着方法出栈而消失
        成员变量：随着对象创建被创建，随着对象被垃圾回收而消失
 */
public class Demo01 {

    String name; //成员变量

    public void method1() {
        int num = 20; //局部变量
        System.out.println(num);
        System.out.println(name); //null
    }

    public void method2(int param) { //方法的参数是局部变量
        //参数在方法调用时，必然已经被赋值
        System.out.println(param);

        int age;
        //System.out.println(num); //错误写法，局部变量作用域仅在方法内部
        //System.out.println(age); //错误写法，局部变量必须赋值使用
        System.out.println(name);
    }
}
