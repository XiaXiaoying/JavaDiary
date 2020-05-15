package cn.nuist.day08.demo07WrapperClass;

/*
装箱：把基本类型的数据，包装到包装类中
    构造方法：
        Integer(int value)：构造一个新分配的Integer对象，它表示指定的int值
        Integer(String s)：构造一个新分配的Integer对象，它表示String参数所指的int值
            传递的字符串，字符串的内容必须为基本类型，否则会抛出异常。"100" 正确 "a" 异常
    静态方法：
        static Integer valueOf(int i) 返回一个表示指定的int值的Integer实例
        static Integer valueOf(String s) 返回保存指定的String的值的Integer实例

拆箱：在包装类中取出基本类型的数据
    成员方法：
        int intValue()：以int类型返回该Integer对象的值

 */
public class Demo01 {

    public static void main(String[] args) {
        //装箱
        //构造方法
        Integer i = new Integer(1); //过时
        Integer j = new Integer("100"); //过时
        System.out.println(i + j); //重写了toString()方法

        //静态方法
        Integer i1 = Integer.valueOf(1);
        System.out.println(i1);

//        Integer i2 = Integer.valueOf("a"); //错误！NumberFormatException数字格式化异常
        Integer i2 = Integer.valueOf("1");
        System.out.println(i2);

        //拆箱
        int i3 = i1.intValue();
        System.out.println(i3);

    }

}
