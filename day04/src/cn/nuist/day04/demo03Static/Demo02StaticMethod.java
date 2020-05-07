package cn.nuist.day04.demo03Static;

/*
一旦使用static修饰成员方法，那么这就称为了静态方法。
静态方法不属于对象，而是属于类。

如果没有static关键字，那么必须先创建对象，再通过对象使用它

无论是成员变量还是成员方法，如果有了static，都推荐使用类名称进行调用
    静态变量：类名称.静态变量
    静态方法：类名称.静态方法()

注意事项：
    1.静态不能直接访问非静态
      原因：在内存中先有静态内容，再有非静态内容
        即：“先人不知道后人，但后人知道先人”
    2.静态方法中不能使用this
      原因：静态方法是通过类调用的，不存在对象
 */
public class Demo02StaticMethod {

    public static void main(String[] args) {

        MyClass obj = new MyClass(); //首先创建对象
        obj.method(); //然后才能使用没有static关键字修饰的方法

        //对于static方法，可以通过对象名调用，更推荐通过类名称调用
        obj.methodStatic(); //不推荐，这种方法会被Javac翻译为下面那种方法
        MyClass.methodStatic(); //推荐

        //对于本类中的静态方法，可以省略类名称
        myMethod(); //javac会自动翻译成下面那种方法
        Demo02StaticMethod.myMethod();
    }

    public static void myMethod() {
        System.out.println("这是本类定义的方法");
    }
}
