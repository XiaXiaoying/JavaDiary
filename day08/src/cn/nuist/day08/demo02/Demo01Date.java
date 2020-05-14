package cn.nuist.day08.demo02;
/*
java.util.Date类
Date类表示特定的瞬间，精确到毫秒
    1.1ms = 1 / 1000 s
    2.特定的瞬间：一个时间点
    3.使用毫秒可以对时间和日期进行计算：
        2099-01-03到2088-01-01中间有多少天：
        可以将日期转换为毫秒进行计算，计算完毕再转换为日期
            1.将日期转换位毫秒，本质上就是计算当前日期到事件源点之间一共经历了多少毫秒
                0毫秒：1970 年 1 月 1 日 00：00：00 GMT
                注意：中国属于东八区，会把时间增加8个小时
                     1970 年 1 月 1 日 08：00：00
            2.将毫秒转换为日期
                1天 = 24 * 60 * 60 * 1000 = 86400,000毫秒
 */
public class Demo01Date {

    public static void main(String[] args) {
        //获取当前系统当前的毫秒值，即当前时刻到1970 年 1 月 1 日 00：00：00
        System.out.println(System.currentTimeMillis()); //1589465489961
    }

}
