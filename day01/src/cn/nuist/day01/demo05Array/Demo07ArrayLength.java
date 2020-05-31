package cn.nuist.day01.demo05Array;
/*
数组长度：数组名称.length
    返回一个int值，代表数组的长度
数组一旦创建，运行期间长度不可改变
 */
public class Demo07ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = { 1, 2, 3, 4, 8, 7, 5, 10 };
        int len = arrayB.length;
        System.out.println("数组arrayB的长度是：" + len);
        System.out.println("=======================");
        System.out.println();

        int[] arrayC = new int[3];
        System.out.println(arrayC.length); //3
        arrayC = new int[5]; //new了一个新的数组，并把地址赋值给arrayC
        System.out.println(arrayC.length); //5
    }
}
