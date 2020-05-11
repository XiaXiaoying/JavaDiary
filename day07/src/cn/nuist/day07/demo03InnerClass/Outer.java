package cn.nuist.day07.demo03InnerClass;


//外部类成员变量和内部类成员变量如果出现了重名现象，区分的格式是：外部类.this.外部类成员变量名
public class Outer {

    int num = 10; //外部类的成员变量

    public class Inner {

        int num = 20; //内部类的成员变量

        public void methodInner() {
            int num = 30; //内部成员方法的局部变量
            System.out.println(num); //30，就近原则
            System.out.println(this.num); //20，内部类的成员变量
            System.out.println(Outer.this.num); //10，外部类的成员变量
        }

    }

    public void methodOuter() {
        int num = 40; //外部成员方法的局部变量
    }

}
