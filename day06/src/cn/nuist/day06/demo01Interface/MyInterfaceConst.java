package cn.nuist.day06.demo01Interface;


/*
接口当中额可以定义“成员变量”，但必须用 public static final 这三个关键字修饰
从效果上看，这其实是接口的【常量】

格式：
    public static final 数据类型 常量名称 = 数据值;

注意：
    1.一旦使用final关键字，说明不可更改
    2.接口中的常量，可以省略public static final，但是不写也照样是这三个
    3.接口中的常量必须赋值
    4.接口中常量的名称，使用完全大写的字母，并用下划线分隔
 */
public interface MyInterfaceConst {

    //这其实是个常量，因为一旦赋值，就不能更改
    public static final int NUM = 10;
    public static String STR = "abc";
    String STR1 = "efg"; //等价于上面的形式


}
