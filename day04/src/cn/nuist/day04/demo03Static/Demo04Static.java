package cn.nuist.day04.demo03Static;

/*
静态代码块：
    public class 类名称 {
        static {
            //静态代码块内容
        }
    }

特点：
    当第一次使用本类时，静态代码块执行【唯一的】一次
    静态内容总是优先于非静态内容执行，即静态代码块比构造方法先执行

用途：
    用来一次性地对静态成员变量进行赋值
 */
public class Demo04Static {

    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();

    }

}
