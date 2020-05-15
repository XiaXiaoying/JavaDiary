package cn.nuist.day08.demo06StringBuilder;

/*
String类：
    字符串是常量，一旦创建不能更改
    字符串的底层：
        private final byte[] value;
    进行字符串的相加，实际上是创建了一个新的字符串，将相加的内容放入

java.lang.StringBuilder类：
    字符串缓冲区，可以提高字符串的操作效率（堪称一个长度可变的字符串）
    底层：
        byte[] value = new byte[16];
    注意：
        StringBuilder在内存中始终是一个数组，占用空间少，效率高
        如果超出了StringBuilder的容量，会自动扩容

    构造方法：
        StringBuilder()：创建一个不带任何字符的字符串生成器，初始容量为16个字符
        StringBuilder(String str)：构造一个字符串生成器，并初始化为指定的字符串




 */
public class Demo01 {

    public static void main(String[] args) {

        //空参数构造方法
        StringBuilder sb1 = new StringBuilder();
        System.out.println("sb1:" + sb1); //sb1:""

        //带参构造方法
        StringBuilder sb2 = new StringBuilder("abc");
        System.out.println("sb2:" + sb2);
    }

}
