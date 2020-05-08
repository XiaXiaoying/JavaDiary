package cn.nuist.day05.demo02;

public class Son extends Father {

    int numSon = 20;
    int num = 200;

    public void methodSon() {
        System.out.println(num); //因为本类中有num，所以用的是自己的
    }
}
