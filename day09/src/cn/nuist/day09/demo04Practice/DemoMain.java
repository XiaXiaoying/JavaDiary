package cn.nuist.day09.demo04Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/*
斗地主案例实践：
    1.准备牌
        共54张牌，存储到一个集合中
        特殊牌：大王和小王
        其他牌：
            定义一个数组，存储4种花色：♠，♥，♣，♦
            定义一个数组，存储13个序号：2,A,K,Q,P,10,9,8,7,6,5,4,3
        循环遍历两个数组，组装到集合中
    2.洗牌
        使用Collections工具类的shuffle(List<?> list)
    3.发牌
        要求：1人17张牌，剩余3张底牌。使用轮流发牌。
        方法：使用集合的索引%3
             定义4个集合分别存储3个玩家的牌和底牌
    4.看牌
        遍历输出
 */
public class DemoMain {

    public static void main(String[] args) {
        //准备牌
        //定义牌的集合，存放所有牌
        ArrayList<String> pokers = new ArrayList<>();
        //定义一个数组，存储4种花色
        String[] colors = {"♠", "♥", "♣", "♦"};
        //定义一个数组，存储13个序号
        String[] numbers = {"2", "A", "K", "Q", "P", "10", "9", "8", "7", "6", "5", "4", "3"};
        //先装大小王
        pokers.add("大王");
         pokers.add("小王");
        //循环遍历两个数组，组装到集合中
        for (String color:colors) {
            for(String number:numbers) {
                pokers.add(color + number);
            }
        }
//        System.out.println(pokers);

        //洗牌
        Collections.shuffle(pokers);
//        System.out.println(pokers);

        //发牌
        //定义4个集合分别存储3个玩家的牌和底牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> bottom = new ArrayList<>();
        //1人17张牌，剩余3张底牌。使用轮流发牌。
        for (int i = 0; i < pokers.size(); i++) {
            if (i >= 51) {
                bottom.add(pokers.get(i));
            } else if (i % 3 == 0) {
                player1.add(pokers.get(i));
            } else if (i % 3 == 1) {
                player2.add(pokers.get(i));
            } else if (i % 3 == 2) {
                player3.add(pokers.get(i));
            }
        }

        //看牌
        System.out.println("player1：" + player1);
        System.out.println("player2：" + player2);
        System.out.println("player3：" + player3);
        System.out.println("底牌：" + bottom);
    }
}
