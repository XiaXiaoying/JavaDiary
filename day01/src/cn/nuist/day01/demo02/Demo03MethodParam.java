package cn.nuist.day01.demo02;

public class Demo03MethodParam {
    public static void main(String[] args) {
        method01(10, 20);
        method02();
    }

    public static int method01(int a, int b) {
        int result = a + b;
        return a + b;
    }
    public static void method02() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello" + i);
        }
    }
}
