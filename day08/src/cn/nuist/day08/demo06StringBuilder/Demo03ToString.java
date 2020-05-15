package cn.nuist.day08.demo06StringBuilder;

/*
StringBuilder类和String类可以相互转换：
    String -> StringBuilder：
        构造方法StringBuilder(String str)
    StringBuilder -> String：
        StringBuilder类中的toString()方法
 */
public class Demo03ToString {

    public static void main(String[] args) {
        //String -> StringBuilder
        String str = "hello";
        System.out.println(str);

        StringBuilder sb = new StringBuilder(str);
        sb.append(" world");
        System.out.println(sb);

        //StringBuilder -> String
        String s = sb.toString();
        System.out.println(s);
    }

}
