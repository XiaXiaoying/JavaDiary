package cn.nuist.day04.demo03Static;

public class Demo03StaticStudent {

    public static void main(String[] args) {

        //首先设置一下room，这是静态变量，通过类来访问
        Student.room = "N202";

        Student one = new Student("sb1",20);
        System.out.println("one的姓名" + one.getName());
        System.out.println("one的年龄" + one.getAge());
        System.out.println("one的教室" + Student.room);
        System.out.println("====================");

        Student two = new Student("sb2",22);
        System.out.println("two的姓名" + two.getName());
        System.out.println("two的年龄" + two.getAge());
        System.out.println("two的教室" + Student.room);
    }
}
