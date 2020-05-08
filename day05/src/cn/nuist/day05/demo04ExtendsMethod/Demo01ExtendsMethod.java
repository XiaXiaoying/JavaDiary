package cn.nuist.day05.demo04ExtendsMethod;

/*
在父子类的继承关系中，创建子类对象，访问成员方法的规则：
    创建的对象是谁，就优先用谁，如果没有则向上找

注意：无论如何父类不会向下找子类

 */
public class Demo01ExtendsMethod {

    public static void main(String[] args) {
        Zi zi = new Zi();

        zi.methodFu();
        zi.methodZi();

        //创建的是子类对象，优先使用子类方法
        zi.method();
    }
}
