package cn.nuist.day09.demo03Generic;

/*
测试含有泛型的方法
 */
public class Demo03GenericMethod {

    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.method01(10);
        gm.method01("abc");
        gm.method01(true);
        System.out.println("=================");

        GenericMethod.method02(2);
        GenericMethod.method02("abccde");
        GenericMethod.method02(true);

    }

}
