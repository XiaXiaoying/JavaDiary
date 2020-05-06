package cn.nuist.day03.demo03Random;

import java.util.Random;

/*
Random类用来生成随机数字
    1.导包：
        import java.util.Random;
    2.创建
        Random r = new Random();
    3.使用
        获取一个随机int数字（范围是所有int，有正负）：int num = r.nextInt();
        获取一个随机int数字（参数代表了范围，左闭右开区间）：int num = r.nextInt(3);
            含义：[0, 3) 也就是0，1，2
 */
public class Demo01Random {

    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt();
        System.out.println("随机数是：" + num);

        for (int i = 0; i < 20; i++) {
            int num1 = r.nextInt(10); //范围实际上是0~9
            if(i == 19)
                System.out.println(num1);
            else
                System.out.print(num1 + ",");
        }
    }

}
