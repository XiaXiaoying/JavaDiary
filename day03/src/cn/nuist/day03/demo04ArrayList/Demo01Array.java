package cn.nuist.day03.demo04ArrayList;
/*
问题描述：定义一个数组，存储三个person对象

数组有一个缺点：一旦创建，运行期间长度不可以改变
 */
public class Demo01Array {

    public static void main(String[] args) {

        Person[] array = new Person[3];
        System.out.println(array[0]); //null
        System.out.println("==============================");

        Person one = new Person("sb",18);
        Person two = new Person("dog", 20);
        Person three = new Person("cat", 22);

        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]); //cn.nuist.day03.demo04ArrayList.Person@2d98a335
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println("==============================");
        System.out.println(array[1].getName()); //dog

    }

}
