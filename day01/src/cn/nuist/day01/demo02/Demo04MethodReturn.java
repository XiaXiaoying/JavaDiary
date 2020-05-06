package cn.nuist.day01.demo02;

/*
对于有返回值的方法，可以使用单独调用，打印调用和赋值调用
但是对于无返回值的方法，只能使用单独调用
 */

public class Demo04MethodReturn {

    public static void main(String[] args) {
        System.out.println("返回值是：" + sum(10, 20));
        printSum(10, 20);
    }

    //计算两个数字之和,有返回值
    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }
    //打印两个数字之和，无返回值
    public static void printSum(int a, int b) {
        int result = a + b;
        System.out.println("结果是：" + result);
    }

}
