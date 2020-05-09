package cn.nuist.day06.demo06;


/*
向上转型一定是安全的。但是有一个弊端：
    对象一旦向上转型为父类，那么就无法使用子类原本特有的内容

解决方案：用对象的向下转型【还原】
格式：
    子类名称 对象名 = (子类名称) 父类对象;
注意事项：
    a.必须保证对象本来创建的时候就是猫，才能从动物向下转型为猫
    b.如果对象本来创建的时候不是猫，向下转型就会报错

 */
public class Demo01Main {

    public static void main(String[] args) {
        //对象的向上转型，就是父类引用指向子类对象
        Animal animal = new Cat();
        animal.eat();

//        animal.catchMouse(); //错误写法！

        //向下转型，进行还原
        Cat cat = (Cat) animal;
        cat.catchMouse(); //猫抓老鼠

        //下面是错误的向下转型
        //new的时候是猫，现在非要把它当作狗
        //错误写法！编译不会报错，但是运行会出现异常
        //java.lang.ClassCastException
//        Dog dog = (Dog) animal;

    }

}
