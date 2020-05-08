package cn.nuist.day05.demo11Practice;

import java.util.ArrayList;

public class Master extends User{

    public Master() {
    }

    public Master(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {

        ArrayList<Integer> array = new ArrayList();

        if (this.getMoney() -totalMoney < 0) {
            System.out.println("钱包余额不够！");
            return array;
        }

        this.setMoney(this.getMoney() - totalMoney); //扣钱
        int each = totalMoney / count; //分钱
        int mod = totalMoney % count; //剩下除不尽的钱


        for (int i = 0; i < count - 1; i++) {
            array.add(each);
        }
        array.add(each + mod); //最后一个红包加上余数

        System.out.println("红包已发出！您现在的余额是：" + this.getMoney() + "元");
        return array;

    }
}
