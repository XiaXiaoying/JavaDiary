package cn.nuist.day03.demo02Anonymous;
/*
创建对象的标准格式：
    类名称 对象名称 = new 类名称();
匿名对象：
    只有右边的对象，没有左边的名字和赋值运算符
    new 类名称();
    注意事项：匿名对象只能使用一次
    使用建议：如果确定一个对象只会使用唯一的一次，就可以使用匿名对象
 */
public class Demo01Anonymous {
    public static void main(String[] args) {

        //左边的one就是对象名
        Person one = new Person();
        one.name = "小明";
        one.age = 20;
        one.showName();
        System.out.println("==============");

        //匿名对象
        new Person().name = "小红";

    }
}
