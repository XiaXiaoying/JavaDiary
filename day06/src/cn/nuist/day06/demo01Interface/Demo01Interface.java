package cn.nuist.day06.demo01Interface;

/*
借口就是多个类公共规范
接口是一种引用数据类型，最重要的内容就是其中的【抽象方法】
如何定义一个接口的格式：
    public interface 接口名称 {
        接口内容
    }

备注：换成关键字interface之后，编译生成的字节码文件仍然是：.java --> .class

如果是Java 7，接口中可以包含的内容有：
    1.常量
    2.抽象方法

如果是Java 8，还可以额外包含：
    3.默认方法
    4.静态方法

如果是Java 9，还可以额外包含：
    5.私有方法

接口使用步骤：
    1.接口不能直接使用，必须有一个"实现类"来实现接口
        格式：
        public class 实现类名称 implements 接口名称 {
            //...
        }
    2.接口的实现类必须Override（实现）接口中所有的抽象方法
        实现：去掉abstract关键字，加上方法体大括号
    3.创建实现类对象进行使用

注意事项：
    如果实现类并没有实现接口中的所有抽象方法，那么这个实现类必须是抽象类

总结：在Java 9版本中，接口的内容可以有：
    1.成员变量（其实是常量）
        [public] [static] [final] 数据类型 常量名称 = 数据值;
        注意：
            常量必须赋值，且不能更改
            常量名称必须完全大写，以下划线区分单词
    2.抽象方法
        [public] [abstract] 返回值类型 方法名(参数列表);
        注意：
            实现类必须覆盖重写（Override）接口所有的抽象方法，除非该实现类是抽象类
    3.默认方法（Java 8+）
        [public] default 返回值类型 方法名称(参数列表) { 方法体 }
        注意：
            默认方法也可以被覆盖重写（Override）
    4.静态方法（Java 8+）
        [public] static 返回值类型 方法名称(参数列表) { 方法体 }
        注意：
            静态方法只能通过接口名称进行调用，不能通过实现类对象调用
    5.私有方法（Java 9+）
        普通私有方法：
            private 返回值类型 方法名称(参数列表) { 方法体 }
        静态私有方法：
            private static 返回值类型 方法名称(参数列表) { 方法体 }
        注意：
            private方法只能被接口自己调用，不能被实现类或其他调用
 */
public class Demo01Interface {

    public static void main(String[] args) {

        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbs();
        impl.methodAbs2();
    }

}
