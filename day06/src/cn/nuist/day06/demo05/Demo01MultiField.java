package cn.nuist.day06.demo05;

/*
访问成员变量的两种方式：
    1.直接通过对象名称访问
        看等号左边是谁，优先就用谁，没有则向上找
    2.间接通过成员方法访问
        看该方法属于谁，就优先用谁，没有则向上找

 */
public class Demo01MultiField {

    public static void main(String[] args) {

        //使用多态的写法，父类引用指向子类对象
        Fu obj = new Zi();

        System.out.println(obj.num); //Fu中的10
//        System.out.println(obj.zi); //错误写法！不能向下找

        //子类没有覆盖重写，则是Fu
        //子类覆盖重写，则是Zi
        //编译看左边，Fu中有showNum方法，编译通过
        //运行看右边，运行的是Zi中的showNum方法，访问的自然是Zi中的num：20
        obj.shouNum(); //子类覆盖重写，就是Zi:20

    }
}
