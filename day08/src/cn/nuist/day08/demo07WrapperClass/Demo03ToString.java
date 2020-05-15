package cn.nuist.day08.demo07WrapperClass;

/*
    基本类型和字符串类型之间的相互转换
    基本类型 -> 字符串（String）
        1.基本类型的值 + "" 最简单常用的方法
        2.包装类的静态方法toString(参数)【不是Object类中的】
            static String toString(参数)
        3.String类的静态方法valueOf(参数)

    字符串（String） -> 基本类型
        使用包装类的静态方法parseXxx(内容是基本类型的字符串)
            Integer类：static int parseInt(String s)
 */
public class Demo03ToString {

    public static void main(String[] args) {

        //基本类型 -> 字符串（String）
        int i = 100;
        String s1 = i + "";
        System.out.println(s1 + 200);

        String s2 = Integer.toString(i);
        System.out.println(s2 + 200);

        String s3 = String.valueOf(i);
        System.out.println(s3 + 200);

        //字符串（String） -> 基本类型
        int i1 = Integer.parseInt(s1);
        System.out.println(i1 + 200);


    }

}
