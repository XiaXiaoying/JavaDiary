package cn.nuist.day05.demo11Practice;

import java.util.ArrayList;

public class Member extends User{

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> array) {

            if (array.isEmpty()) {
                System.out.println("不好意思，红包已经抢完了");
            } else {
                int moneyAdd = array.get(0);
                this.setMoney(this.getMoney() + moneyAdd);
                array.remove(0);
                System.out.println("恭喜" + this.getName() + "，抢到了" + moneyAdd + "元，现在余额是：" + this.getMoney() + "元");
            }

    }

}
