package cn.nuist.day02.demo01OOP;

public class Demo04PhoneParam {

    public static void main(String[] args) {

        Phone one = new Phone();
        one.brand = "Apple";
        one.price = 8388.0;
        one.color = "black";

        method(one);//传递进去的是one这个对象的地址
    }

    public static void method(Phone param) {
        System.out.println(param.brand);//Apple
        System.out.println(param.price);//8388.0
        System.out.println(param.color);//black
    }

}
