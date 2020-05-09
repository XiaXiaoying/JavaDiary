package cn.nuist.day06.demo01Interface;


public interface MyInterfacePrivateB {

    public static void methodStatic1() {
        System.out.println("静态方法1");
        methodCommon();
    }

    public static void methodStatic2() {
        System.out.println("静态方法2");
        methodCommon();
    }

    private static void methodCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

}
