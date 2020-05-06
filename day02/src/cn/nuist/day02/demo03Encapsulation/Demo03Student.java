package cn.nuist.day02.demo03Encapsulation;

public class Demo03Student {

    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("小明");
        stu.setAge(18);
        stu.setMale(true);

        System.out.println("姓名：" + stu.getName());
        System.out.println("年龄：" + stu.getAge());
        System.out.println("是不是爷们：" + stu.isMale());
    }
}
