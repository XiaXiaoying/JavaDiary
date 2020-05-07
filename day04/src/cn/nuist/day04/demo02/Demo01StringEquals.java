package cn.nuist.day04.demo02;

/*
==是进行对象的地址值比较，如果确实需要字符串内容的比较，可以使用两个方法：

    1.public boolean equals(Object obj)：参数可以是任何对象
        注意：1.任何对象都能用Object接收，但是只有参数是一个字符串且内容相同时才会返回true，否则返回false
             2.equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样
             3.如果比较双方一个常量一个变量，推荐把常量写在前面

    2.public boolean equalsIgnoreCase(String str)：忽略大小写，进行内容比较

 */
public class Demo01StringEquals {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = { 'H', 'e', 'l', 'l', 'o' };
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2)); //true
        System.out.println(str2.equals(str3)); //true
        System.out.println(str1.equals("Hello")); //true
        System.out.println("Hello".equals(str1)); //true
        System.out.println("==========================");

        String str5 = null;
        System.out.println("abc".equals(str5)); //推荐    false
        //System.out.println(str5.equals("abc")); //不推荐  报错：NullPointerException
        System.out.println("==========================");

        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB)); //false
        System.out.println(strA.equalsIgnoreCase(strB)); //true
    }
}
