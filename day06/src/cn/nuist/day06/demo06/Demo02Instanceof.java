package cn.nuist.day06.demo06;


/*
如何才能知道一个父类引用的对象，本来是什么子类？
格式：
    对象 instanceof 类型
    将会得到一个boolean值，代表前面的对象能不能当作后面类型的实例
 */
public class Demo02Instanceof {

    public static void main(String[] args) {
        Animal animal = new Dog(); //本来是一只猫
        animal.eat(); //猫吃鱼

        //如果希望用子类特有方法，需要向下转型
        //判断一下父类引用animal本来是不是Dog
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }

        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }

    }

    public static void giveMeAPet(Animal animal) { //传谁都行

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }

    }

}
