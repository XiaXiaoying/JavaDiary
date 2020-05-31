package cn.nuist.day10.demo04.VarArgs;

/*
    可变参数：是jdk1.5之后的新特性
    使用前提：
        当方法的参数列表数据类型已经确定，但是参数的个数不确定，就可以使用可变参数
    使用格式：定义方法时使用
        修饰符 返回值类型 方法名(数据类型... 变量名){}
    可变参数的底层原理：
        可变数组在底层是一个数组，根据传递参数个数不同，会创建不同长度的数组，来存储这些参数
        传递的参数个数，可以是0，1，2，...个
    可变参数的注意事项：
        1.一个方法的参数列表，之恶能有一个可变参数
        2.如果方法的参数有多个，那么可变参数写在啊承诺书列表的末尾
        3.特殊写法：Object...obj，可以接受任意类型
 */
public class Demo01VarArgs {

    public static void main(String[] args) {
        System.out.println(add(10,20)); // 30
        System.out.println(add(10,20,30,40)); // 100
    }

    // 定义一个方法，计算n个整数和
    public static int add(int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
