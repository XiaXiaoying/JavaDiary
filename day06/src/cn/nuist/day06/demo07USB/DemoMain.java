package cn.nuist.day06.demo07USB;

public class DemoMain {

    public static void main(String[] args) {
        //首先创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn();

        /*
        //准备一个鼠标供电脑使用
        Mouse mouse = new Mouse();
        //首先进行向上转型
        USB usb = (USB) mouse;
        */

        USB usbMouse = new Mouse();
        //参数要求USB类型，传递进去的就是USB鼠标
        computer.useDevice(usbMouse);

        //创建一个USB键盘
        Keyboard keyboard = new Keyboard();
        //参数要求USB类型，传递进去的是实现类对象
        computer.useDevice(keyboard); //正确写法！也发生了向上转型
        computer.useDevice(new Keyboard()); //也是正确写法！使用了匿名对象

        computer.powerOff();

        method(10); //发生了自动类型转换
    }

    public static void method(double num) {
        System.out.println(num);
    }

}
