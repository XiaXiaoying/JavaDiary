package cn.nuist.day08.demo03DateFormat;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
java.text.DateFormat：是日期/时间格式化子类的抽象类
作用：
    格式化（日期 -> 文本），解析（文本 -> 日期）
成员方法：
    String format(Date date) 按照指定的模式，把Date日期格式化为字符串
    Date parse(String source) 把符合模式的字符串，解析为Date日期
注意：DateFormat类是一个抽象类，无法直接使用。可以使用子类java.text.SimpleDateFormat

java.text.SimpleDateFormat：
构造方法：
    SimpleDateFormat(String pattern) ：
        参数：String pattern：传递指定的模式
        模式：区分大小写
                 y      年
                 M      月
                 d      日
                 H      小时
                 m      分
                 s      秒
             写对应的模式，会把模式替换为对应的日期和时间：
                "yyyy-MM-dd HH:mm:ss"
            注意：模式中的字母不能更改，连接模式的符号可以更改
                "yyyy年MM月dd日 HH时mm分ss秒"

 */
public class Demo01DateFormat {

    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
    }

    /*
    使用DateFormat类中的format()方法，将日期格式化为文本
    使用步骤：
        1.创建一个SimpleDateFormat对象，在构造方法中传递指定的模式
        2.调用该对象的format()方法，按照构造方法中指定的格式将Date日期格式化为字符串
     */
    private static void demo01() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = simpleDateFormat.format(new Date());
        System.out.println(s);
    }

    /*
    调用DateFormat类中的parse()方法，将文本解析为日期
    使用步骤：
        1.创建一个SimpleDateFormat对象，在构造方法中传递指定的模式
        2.调用该对象的parse()方法，按照构造方法中指定的格式将文本解析为日期
        注意：
            public Date parse(String source) throws ParseException
            parse方法声明了一个异常，叫ParseException
            如果字符串和构造方法的模式不一样，那么程序就会抛出异常
            调用一个抛出了异常的方法，就必须处理这个异常，要么throws继续抛出，要么try catch自己处理
     */
    private static void demo02() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse("2020-05-14 23:03:05");
        System.out.println(date);
    }


}
