package cn.nuist.day07.demo01;

/*
对于成员变量来说，如果使用final关键字修饰，那么这个变量也照样不可改变

1.由于成员变量具有默认值，所以用了final之后必须手动赋值，不会再给默认值了
2.对于final的成员变量，要么直接赋值，要么构造方法赋值
3.必须保证类中所有重载的构造方法都对final成员变量赋值
 */
public class Person {

    private final String name;

    public Person() {
        this.name = "sb";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
