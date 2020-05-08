package cn.nuist.day05.demo02;

/*
在父子类的继承关系中，如果成员变量重名，则创建子类对象时，有两种访问方式：
    直接通过子类对象访问成员变量
        左边是谁，就优先用谁，没有则向上找
    间接通过成员方法访问成员变量
        该方法【属于谁】，就优先用谁，没有则向上找
 */
public class Demo01ExtendsField {

    public static void main(String[] args) {

        Father fu = new Father(); //创建父类对象
        System.out.println(fu.numFu); //只能使用父类的成员变量

        Son zi = new Son();
        System.out.println(zi.numFu);
        System.out.println(zi.numSon);
        System.out.println("================");

        System.out.println(zi.num); //优先子类，200
        System.out.println("================");

        //这个方法是子类的，优先用子类的，没有向上找
        zi.methodFather(); //200
        //这个方法是在父类中定义的
        zi.methodFather(); //100
    }
}
