package cn.nuist.day01.demo05Array;

/*

 */
public class Demo05ArrayIndex {
    public static void main(String[] args) {
        int[] array = { 15, 25, 35 };
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        //错误写法：索引越界，ArrayIndexOutOfBoundsException
        //System.out.println(array[3]);
    }
}
