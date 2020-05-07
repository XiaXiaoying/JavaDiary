package cn.nuist.day04.demo02;

/*
String中与转换相关的常用方法：
    public char[] toCharArray()：将当前字符串拆成字符数组作为返回值
    public byte[] getBytes()：获取当前字符串底层的字节数组
    public String replace(CharSequence oldString, charSequence newString)：
        将所有出现的老字符串替换为新字符串，返回替换之后的结果新字符串
        备注：CharSequence意思就是可以接收字符串类型
 */
public class Demo04StringConvert {

    public static void main(String[] args) {

        //转换为字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]); //H
        System.out.println(chars.length);
        System.out.println("============");

        //转换为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + " ");
        }
        System.out.println("============");

        //字符串的内容替换
        String str1 = "sb,nmsl";
        String str2 = str1.replace("sb", "**");
        String str3 = str2.replace("nmsl", "****");
        System.out.println(str1); //sb,nmsl
        System.out.println(str2); //**,nmsl
        System.out.println(str3); //**,****

    }
}
