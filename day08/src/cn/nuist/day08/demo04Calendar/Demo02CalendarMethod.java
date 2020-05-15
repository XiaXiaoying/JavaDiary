package cn.nuist.day08.demo04Calendar;


import java.util.Calendar;
import java.util.Date;

/*
成员方法：
    int field：日历类的字段，可以使用Calendar类的静态成员变量获取
 */
public class Demo02CalendarMethod {

    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
        demo04();
    }


    /*
        public int get(int field)：返回给定日历字段的值
        参数：传递指定的日历字段(YEAR, MONTH, ...)
        返回值：日历字段代表的具体的值
     */
    private static void demo01() {

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(calendar.YEAR);
        System.out.println(year);

        int month = calendar.get(calendar.MONTH);
        System.out.println(month + 1); //从0开始

        int date = calendar.get(calendar.DAY_OF_MONTH); //DAY_OF_MONTH = DATE
        System.out.println(date);
    }

    /*
       public void set(int field, int value)：将给定的日历字段设置为给定值
       参数：
           int field：传递指定的日历字段
           int value：给指定字段设置的值
     */
    private static void demo02() {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, 9999); //设置年为9999

        //set有一个重载方法，可以同时设置年月日
        calendar.set(8888,9,19);

        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);

        int month = calendar.get(Calendar.MONTH);
        System.out.println(month + 1); //从0开始

        int date = calendar.get(Calendar.DAY_OF_MONTH); //DAY_OF_MONTH = DATE
        System.out.println(date);
    }

    /*
        public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量
        把指定的字段增加/减少指定的值
        参数：
            int field：传递指定的日历字段
            int amount：增加/减少指定的值
                正数：增加；负数：减少

     */
    private static void demo03() {
        Calendar calendar = Calendar.getInstance();

        //把年增加2
        calendar.add(Calendar.YEAR,2);
        //把月减少3
        calendar.add(Calendar.MONTH,3);

        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);

        int month = calendar.get(Calendar.MONTH);
        System.out.println(month + 1); //从0开始

        int date = calendar.get(Calendar.DAY_OF_MONTH); //DAY_OF_MONTH = DATE
        System.out.println(date);
    }

    /*
        public Date getTime()：返回一个表示此Calendar时间值（毫秒值）的Date对象
        把日历对象转换为日期对象
     */
    private static void demo04() {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
    }


}
