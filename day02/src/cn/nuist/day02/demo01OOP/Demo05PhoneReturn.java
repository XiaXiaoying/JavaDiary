package cn.nuist.day02.demo01OOP;

public class Demo05PhoneReturn {

    public static void main(String[] args) {
        Phone two = getPhone();//将返回的地址值赋值给two
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }

    public static Phone getPhone() {
        Phone one = new Phone();
        one.brand = "Apple";
        one.price = 8388.0;
        one.color = "black";
        return one;//返回的是对象的地址
    }
}
