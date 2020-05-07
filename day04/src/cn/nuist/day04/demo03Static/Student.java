package cn.nuist.day04.demo03Static;

public class Student {

    private int id;
    private String name;
    private int age;
    static String room;
    private static int idCount = 0; //所有学生对象共享一个idCount变量

    public Student() {
        id = ++idCount;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
