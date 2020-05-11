package cn.nuist.day07.demo05;

/*
如果接口的实现类或者父类的子类只需要使用唯一的一次
那么这种情况下就可以省略该类的定义，改为【匿名内部类】

匿名内部类的定义格式：
    接口名称 对象名 = new 接口名称() {
        //覆盖重写所有抽象方法
    }

对格式：new 接口名称() {...} 进行解析：
    1.new代表创建对象的动作
    2.接口名称就是匿名内部类需要实现哪个接口
    3.{...}才是匿名内部类的内容

注意事项：
    1.匿名内部类，再【创建对象】的时候，只能使用唯一一次。如果要使用多次，那就创建实现类
    2.匿名对象，在【调用方法】的时候，只能调用唯一一次。如果需要同一个对象调用多次对象，则需要给对象起个名字
    3.匿名内部类是省略了【实现类/子类名称】，但是匿名对象是省略了【对象名称】
    匿名内部类和匿名对象不是一回事！
 */
public class DemoMain {

    public static void main(String[] args) {

        //只使用了一次，却创建了一个文件，麻烦
//        MyInterface impl = new MyInterfaceImpl();
//        impl.method();

        //使用匿名内部类，但没有使用匿名对象，对象名称就叫a
        MyInterface a = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了抽象方法！");
            }
        };
        a.method();

        //既使用了匿名内部类，也使用了匿名对象
        new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了抽象方法！");
            }
        }.method();


    }

}
