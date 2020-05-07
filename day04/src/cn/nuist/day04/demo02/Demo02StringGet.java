package cn.nuist.day04.demo02;

/*
String中与获取相关的常用方法：

    public int length()：获取字符串当中含有的字符个数，即字符串长度
    public String concat(String str)：将当前字符串和参数字符串拼接，返回新的字符串
    public char charAt(int index)：获取指定索引位置的单个字符
    public int indexOf(String str)：查找参数字符串在本字符串中首次出现的索引位置，没有则返回-1
 */
public class Demo02StringGet {

    public static void main(String[] args) {

        //获取字符串的长度
        int length = "sdfagdfasgsdifuhweirf".length();
        System.out.println("字符串的长度是：" + length);

        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1); //Hello
        System.out.println(str2); //World
        System.out.println(str3); //HelloWorld 新的字符串
        System.out.println("=======================");

        //获取指定位置的单个字符
        System.out.println("在4号索引处的字符：" + "Hello".charAt(4)); //o
        System.out.println("=======================");

        //查照参数字符串在原字符串中第一次出现的索引值
        String original = "HelloWorld";
        int index = original.indexOf("llo");
        System.out.println("第一次出现的位置：" + index); //2

    }
}
