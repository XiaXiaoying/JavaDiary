package cn.nuist.day05.demo07Constructor;

public class Zi extends Fu {

    public Zi() {
        //super(); //在调用子类构造方法时隐含的
        super(10);
        System.out.println("子类构造方法");
    }

    public void method() {
//        super(); //错误写法！只有子类的构造方法可以调用父类的构造方法
    }
}
