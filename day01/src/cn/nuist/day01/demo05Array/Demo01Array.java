package cn.nuist.day01.demo05Array;

/*
数组：存放多个数据值的容器
特点：
    1.数组是引用类型
    2.数组中的数据类型统一
    3.数组的长度在运行期间不可改变

数组的初始化：在内存中创建一个数组，并放入一些默认值

常见的两种初始化方法：
    1.动态初始化：指定长度：数据类型[] 数组名称 = new 数据类型[数组长度];
    2.静态初始化：指定内容
                    标准格式：数据类型[] 数组名称 = new 数据类型[] { 元素1，元素2，... };
                    省略格式：数据类型[] 数组名称 = { 元素1， 元素2， ... };
注意事项：
    1.静态初始化没有指定长度，但是会自动推算出长度
    2.静态初始化标准格式可以拆分出两个步骤
    3.动态初始化也可以拆分为两步
    4.静态初始化省略格式不可以拆分
    5.不确定具体内容时用动态，确定内容时用静态
 */
public class Demo01Array {
    public static void main(String[] args) {

        //动态初始化
        int[] arrayA = new int[300];
        String[] accayB = new String[20];

        //静态初始化
        int[] arrayC = new int[] { 5, 15, 25 };
        String[] arrayD = new String[] { "Hello", "World" };

        //静态初始化的省略格式
        int[] arrayE = { 5, 15, 25 };

        //静态初始化标准格式，可以拆分为两步
        int[] arrayF;
        arrayF = new int[] { 5, 15, 25 };

        //动态初始化也可以拆分为两步
        int[] arrayG;
        arrayG = new int[10];

        //静态初始化省略格式不可以拆分
        //int[] arrayH;
        //arrayH = { 1, 2, 3 };

    }
}
