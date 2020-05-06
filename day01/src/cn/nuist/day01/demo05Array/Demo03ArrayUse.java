package cn.nuist.day01.demo05Array;
/*
使用动态初始化数组时，其中元素会有默认值，规则如下：
    1.如果是整数类型，默认为0
    2.如果是浮点类型，默认为0.0
    3.如果是字符类型，默认为'\u0000'
    4.如果是布尔类型，默认为false
    5.如果是引用类型，默认为null

注意事项：
静态初始化其实也有默认值的过程，只不过系统立刻将具体值替换默认值
 */
public class Demo03ArrayUse {
    public static void main(String[] args) {

        int[] array = new int[3];

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println("=================");

        array[1] = 3;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}
