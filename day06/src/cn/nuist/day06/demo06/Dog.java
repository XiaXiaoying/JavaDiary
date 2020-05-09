package cn.nuist.day06.demo06;

public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗吃屎");
    }

    public void watchHouse() {
        System.out.println("狗能看家");
    }
}
