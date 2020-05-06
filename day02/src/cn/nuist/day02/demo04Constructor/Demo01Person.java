package cn.nuist.day02.demo04Constructor;

public class Demo01Person {

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "你爸爸";
        person.sayHello("龙狗");
        System.out.println("person对象的地址：" + person);
    }
}
