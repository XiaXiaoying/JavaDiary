package cn.nuist.day01.demo03;

/*
1.方法不能嵌套定义
2.方法定义的前后顺序无所谓
3.方法调用：单独调用、打印调用、赋值调用
4.void只能return自己，其他有且类型必须对应
5。一个方法可以定义多个return，但必须保证只有一个会被执行
 */
public class Demo04MethodNotice {

    public static void main(String[] args) {

    }

    public static void method01() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
        return;//可以省略
    }
}
