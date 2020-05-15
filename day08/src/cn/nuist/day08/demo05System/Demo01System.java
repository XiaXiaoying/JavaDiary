package cn.nuist.day08.demo05System;


import java.util.Arrays;

/*
java.lang.System提供了大量静态方法
    static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)：将数组中的指定数据拷贝到另一个数组中
    static long currentTimeMillis()：获取当前时间的毫秒值
 */
public class Demo01System {

    public static void main(String[] args) {
        demo01();
        demo02();


    }


    /*
        static long currentTimeMillis()：获取当前时间的毫秒值
        可以用来测试程序的效率
        练习：验证用for循环打印1到9999所需要的时间
     */
    private static void demo01() {
        long s = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i + 1);
        }
        long e = System.currentTimeMillis();
        System.out.println("程序共耗时：" + (e - s) + "毫秒");
    }

    /*
        static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)：
            将数组中的指定数据拷贝到另一个数组中
        参数：
            src - 源数组。
            srcPos - 源数组中的起始位置。
            dest - 目标数组。
            destPos - 目的地数据中的起始位置。
            length - 要复制的数组元素的数量。
        练习：将src数组的前3个元素，复制到dest数组的前3个位置
             src:[1,2,3,4,5]
             dest:[6,7,8,9,10]
     */
    private static void demo02() {
        int src[] = {1, 2, 3, 4, 5};
        int dest[] = {6, 7, 8, 9, 10};
        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(dest));

    }


}
