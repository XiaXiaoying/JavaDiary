package cn.nuist.day04.demo02;

/*
字符串的截取方法：
    public String substring(int index)：截取从参数位置到字符串末尾，返回一个新字符串
    public String substring(int begin, int end)：截取从begin开始，到end结束，返回一个新字符串。（包含begin，不包含end）
 */
public class Demo03Substring {

    public static void main(String[] args) {

        String str1 = "HelloWorld";

        String str2 = str1.substring(5);
        System.out.println(str1); //HelloWorld
        System.out.println(str2); //World 创建了一个新字符串
        System.out.println("================");

        String str3 = str1.substring(4, 7);
        System.out.println(str3); //oWo
        System.out.println("================");

    }
}
