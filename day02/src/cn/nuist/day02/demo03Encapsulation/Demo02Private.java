package cn.nuist.day02.demo03Encapsulation;

public class Demo02Private {

    public static void main(String[] args) {
        Person ming = new Person();
        ming.show();
        ming.name = "小明";
        //ming.age = 18; //错误写法，直接访问了private内容
        ming.setAge(20);
        ming.show();

    }

}
