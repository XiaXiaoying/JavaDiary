package cn.nuist.day02.demo01OOP;

public class Demo03PhoneOne {

    public static void main(String[] args) {

        Phone iPhone = new Phone();
        iPhone.brand = "Apple";
        iPhone.color = "black";
        iPhone.price = 999;
        System.out.println(iPhone.brand);
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);
        System.out.println("===================");

        iPhone.call("龙狗");
        iPhone.sendMessage();
        iPhone.sendMessage("弟弟");
        System.out.println("===================");
        
        Phone Huawei = new Phone();
        Huawei.brand = "Huawei";
        Huawei.color = "white";
        Huawei.price = 9999;
        System.out.println(Huawei.brand);
        System.out.println(Huawei.color);
        System.out.println(Huawei.price);
        System.out.println("===================");

        Huawei.call("龙狗狗");
        Huawei.sendMessage();
        Huawei.sendMessage("爸爸");
    }
}
