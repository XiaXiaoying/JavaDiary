package cn.nuist.day01.demo05Array;
/*
一个方法可以接受多个参数，但只能返回一个值
如果希望返回多个值，可以使用一个数组作为返回类型
数组作为参数或返回值时，实际传递的都是数组的地址
 */
public class Demo10ArrayReturn {

    public static void main(String[] args) {
        int[] result = calculate(1, 2, 3);
        System.out.println("方法调用接收到的结果是：" + result);
        System.out.println("sum = " + result[0]);
        System.out.println("avg = " + result[1]);

    }

    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        int[] array = { sum, avg };
        System.out.println("方法传递的是：" + array);
        return array;
    }
}
