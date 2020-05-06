package cn.nuist.day01.demo05Array;

/*
直接打印数组名称。得到的是数组对应内存地址的哈希值
访问数组中数据元素格式：数组名称[索引值]
注：索引值从0开始，到数组长度-1为止
 */
public class Demo02ArrayUse {
    public static void main(String[] args) {

        int[] arrayA = { 10, 20, 30 };

        System.out.println(arrayA); //[I@5fd0d5ae

        System.out.println(arrayA[0]);
    }
}
