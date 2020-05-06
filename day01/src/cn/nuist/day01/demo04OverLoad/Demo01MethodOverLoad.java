package cn.nuist.day01.demo04OverLoad;

/*
重载的注意事项：
1.定义：方法名称一样，但是参数列表不同
2.参数列表不同的含义：
    1.参数个数不同
    2.参数类型不同
    3.多类型参数的顺序不同
3.重载与以下因素无关：
    1.参数名称
    2.与方法的返回值类型无关
 */
public class Demo01MethodOverLoad {

    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
