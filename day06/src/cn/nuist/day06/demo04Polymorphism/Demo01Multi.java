package cn.nuist.day06.demo04Polymorphism;

/*
代码中体现多态性，其实就是一句话：父类引用指向子类对象
即，右侧创建一个子类对象，把它当成父类对象来使用

格式：
    父类名称 对象名 = new 子类名称();
或者：
    接口名称 对象名 = new 实现类名称();

多态的好处：无论右边new的时候换成哪个子类对象，左边调用方法时都是一致的。
 */
public class Demo01Multi {

    public static void main(String[] args) {

        //多态的写法
        //左侧父类的引用指向了右侧子类的对象
        Fu obj = new Zi();

        obj.method();
        obj.methodFu();

    }

}
