package cn.nuist.day01.demo05Array;
/*
数组作为方法的参数时，当调用方法，向方法进行传参，传递的时数组的地址值
 */
public class Demo09ArrayParam {
    public static void main(String[] args) {

        int[] array = { 10, 20, 30, 40, 50 };
        printArray(array);
    }

    public static void printArray(int[] array) {
        System.out.println("printArray接收到的参数：" + array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
