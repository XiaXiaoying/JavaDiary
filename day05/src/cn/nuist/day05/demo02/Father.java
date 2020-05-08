package cn.nuist.day05.demo02;

public class Father {

    int numFu = 10;
    int num = 100;

    public void methodFather() {
        System.out.println(num); //使用的是本类的100，不会向下找子类
    }
}
