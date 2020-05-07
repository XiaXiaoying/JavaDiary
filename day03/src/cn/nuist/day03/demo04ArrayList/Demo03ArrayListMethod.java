package cn.nuist.day03.demo04ArrayList;

import java.util.ArrayList;

/*
ArrayList中的常用方法：
    public boolean add(E e)：向集合中添加元素，参数的类型和泛型一致
        备注：对于ArrayList集合来说，add添加一定是成功的，所以返回值可以不用
             但是对于其他集合来说，add不一定成功
    public E get(int index)：从集合中获取元素，参数是索引编号，返回值就是对应位置的元素
    public E remove(int index)：从集合中删除元素，参数是索引编号，返回值是被删除掉的元素
    public int size()：获取集合的长度，返回值是集合中元素的个数
        备注：对于数组，数组名.length为数组长度，是成员变量
             对于ArrayList，ArrayListName.size()返回集合长度，是成员方法
 */
public class Demo03ArrayListMethod {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); //[]

        //向集合中添加元素：add
        boolean success = list.add("sb");
        System.out.println(list); //[sb]
        System.out.println("添加的动作是否成功：" + success); //true

        list.add("nt");
        list.add("sd");
        System.out.println(list);
        System.out.println("=========================");

        //从集合中获取元素：get
        String name = list.get(2);
        System.out.println("第2号索引位置：" + name);
        System.out.println("=========================");

        //从集合中删除元素：remove
        String whoRemoved = list.remove(1);
        System.out.println("被删除的人：" + whoRemoved);
        System.out.println(list);
        System.out.println("=========================");

        //获取集合的长度（元素的个数）：size
        int size = list.size();
        System.out.println("集合的长度：" + size);
        System.out.println(list);
    }
}
