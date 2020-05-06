package cn.nuist.day01.demo03;

public class Demo03MethodHello {

    public static void main(String[] args) {
        printHello(3);
    }

    public static void printHello(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("Hello,World!" + (i + 1));
        }
    }
}
