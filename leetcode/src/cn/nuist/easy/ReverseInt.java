package cn.nuist.easy;
/*
问题描述：给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

注意：假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。
请根据这个假设，如果反转后整数溢出那么就返回 0。

分析：
    取最后一位操作：x % 10
    定义一个result存放最终结果，初值为0
    定义一个temp存放中间结果，temp = result * 10 + x % 10
    计算出temp后，x = x / 10
    循环直至x == 0，因为不知道循环次数，使用while循环

    判断溢出条件：每一次循环计算出temp后，将temp代入式中，反求出result，与求temp之前的result比较，不等则溢出
    x      120  12   1     0
    temp   0    2    21
    result 0    0    2
           0    2    21
    temp是result的后一个状态

 */
public class ReverseInt {

    public static void main(String[] args) {
        int testNum1 = 1234;
        int testNum2 = 120;
        int testNum3 = 1147483649;

        System.out.println(reverse(testNum1));
        System.out.println(reverse(testNum2));
        System.out.println(reverse(testNum3));

    }

    public static int reverse(int x) {
        int result = 0;
        while(x != 0 ) {
            int temp = result * 10 + x % 10;
            if((temp - x % 10) / 10 != result) { //将temp转换到前一个状态，与result比较，若不等则溢出
                return 0;
            }
            result = temp;
            x /= 10;
        }
        return result;
    }

}
