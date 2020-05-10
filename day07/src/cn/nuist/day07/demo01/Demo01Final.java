package cn.nuist.day07.demo01;

/*
final关键字代表最终，不可改变的

常见的四种用法：
    1.可以修饰一个类
    2.可以修饰一个方法
    3.可以修饰一个局部变量
    4.可以修饰一个成员变量
 */
public class Demo01Final {

    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);
        num = 20;
        System.out.println(num);
        System.out.println("==============");

        final int num2 = 100;
        System.out.println(num2);
//        num2 = 100;
//        num2 = 200; //都是错误写法

        //正确写法，只要保证有唯一一次赋值
        final int num3;
        num3 = 30;

        //对于基本类型来说，不可改变的是变量中的数据
        //对于引用类型来说，不可改变的是变量中的地址

        Student stu1 = new Student("sb");
        System.out.println(stu1); //cn.nuist.day07.demo01.Student@10f87f48
        System.out.println(stu1.getName()); //sb
        stu1 = new Student("nt");
        System.out.println(stu1); //cn.nuist.day07.demo01.Student@b4c966a
        System.out.println(stu1.getName()); //nt

        final Student stu2 = new Student("sbsb");
        //错误写法！final的引用类型变量，其中的地址不可改变
//        stu2 = new Student("sbsbsb");
        stu2.setName("sbsbsbsbsbsb");
        System.out.println(stu2.getName());
    }

}
