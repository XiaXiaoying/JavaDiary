package cn.nuist.day05.demo10Abstract;

public class DemoMain {

    public static void main(String[] args) {

//        Animal animal = new Animal(); //错误写法！不能new抽象类对象
        Cat cat = new Cat();
        cat.eat();

    }

}
