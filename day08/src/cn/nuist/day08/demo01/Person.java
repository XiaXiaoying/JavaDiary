package cn.nuist.day08.demo01;

import java.util.Objects;

public class Person {

    private String name;
    private int age;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
    Object类的toString()方法，默认返回的是对象所在的类名称的字符串@对象地址。
     */
//    @Override
//    public String toString() { //覆盖重写Object类中的toString()方法
//        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
    Object类的equals()方法，默认比较的是两个对象的地址值，没有意义
    所以要重写方法，比较两个对象的属性
    问题：
        隐含多态
        多态的弊端：无法使用子类特有的成员变量和成员方法
        Object obj = new Person("sb", 18);
    解决方法：向下转型，将Object转换为Person

    */
//    @Override
//    public boolean equals(Object obj) {
//        //增加2个判断，提高程序效率
//        if (obj == null) {
//            return false;
//        }
//        if (this == obj) {
//            return true;
//        }
//        if (obj instanceof Person) {
//            Person person = (Person) obj;
//            if (this.age == person.age && this.name.equals(person.name)) {
//                return true;
//            }
//        }
//        return false;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //getClass() != o.getClass(),使用反射计数判断o是否属于Person类型，等效于obj instanceof Person
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name); //防止空指针异常
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
