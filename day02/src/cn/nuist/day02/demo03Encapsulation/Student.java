package cn.nuist.day02.demo03Encapsulation;
/*
对于基本类型中的boolean值，Getter方法一定要写成isXxx形式
 */
public class Student {

    private String name;
    private int age;
    private boolean male;

    public void setName(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }

    public void setAge(int num) {
        age = num;
    }

    public int getAge() {
        return age;
    }

    public void setMale(boolean b) {
        male = b;
    }

    public boolean isMale() {
        return male;
    }
}
