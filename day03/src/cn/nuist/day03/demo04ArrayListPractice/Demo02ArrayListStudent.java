package cn.nuist.day03.demo04ArrayListPractice;

import java.util.ArrayList;

/*
题目：自定义四个学生对象，添加到集合，并遍历输出

思路
    1.自定义Student类，四个部分
    2.创建一个集合，泛型：<Student>
    3.根据类创建四个学生对象
    4.将学生对象添加到集合中：add
    5.遍历：get
 */
public class Demo02ArrayListStudent {

    public static void main(String[] args) {

        Student stu1 = new Student("s1", 18);
        Student stu2 = new Student("s2", 20);
        Student stu3 = new Student("s3", 10);
        Student stu4 = new Student("s4", 19);

        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        for (int i = 0; i < 4; i++) {
            System.out.println(list.get(i).getName());
        }

    }
}
