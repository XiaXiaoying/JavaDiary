package cn.nuist.day05.demo11Practice;

import java.util.ArrayList;

public class DemoMain {

    public static void main(String[] args) {
        Master master = new Master("群主", 200);
        Member member1 = new Member("成员1号", 5);
        Member member2 = new Member("成员2号", 10);
        Member member3 = new Member("成员3号", 20);

        ArrayList<Integer> array = master.send(20,3);
        member1.receive(array);
        member2.receive(array);
        member3.receive(array);

    }

}
