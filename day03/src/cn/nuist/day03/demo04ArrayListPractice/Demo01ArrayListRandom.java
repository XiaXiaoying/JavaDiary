package cn.nuist.day03.demo04ArrayListPractice;

import java.util.ArrayList;
import java.util.Random;

/*
问题描述：生成6个1~33之间的随机数，添加到集合，并遍历输出

思路：
    1.需要存储6个数字，创建集合，<Integer>
    2.产生随机数，需要用Random，0到32整体+1
    3.用循环6此产生随机数，for
    4.循环内调用r.nextInt(int n)
    5.把数字添加到集合中，add
    6.遍历集合：for，size，get
 */
public class Demo01ArrayListRandom {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            list.add(r.nextInt(33) + 1);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        
    }

}
