package cn.nuist.day06.demo07USB;

public class Computer {

    public void powerOn() {
        System.out.println("电脑开机");
    }

    public void powerOff() {
        System.out.println("电脑关机");
    }

    public void useDevice(USB usb) {
        usb.open();
        if(usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        } else if (usb instanceof Keyboard) {
//            Keyboard keyboard = (Keyboard) usb;
//            keyboard.type();
            ((Keyboard) usb).type(); //这种写法也可以
        }
        usb.close();
    }
}
