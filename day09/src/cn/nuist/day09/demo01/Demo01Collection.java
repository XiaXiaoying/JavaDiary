package cn.nuist.day09.demo01;

import java.util.ArrayList;
import java.util.Collection;

/*
java.util.Collection接口
    所有单列集合的最顶层的接口，里面定义了所以单列集合共性的方法
    任意的单列集合都可以使用Collection接口中的方法

    共性的方法：
        public boolean add(E e)：    把给定的对象添加到当前集合中
        public void clear()：    清空集合中的所有元素
        public boolean remove(E e)： 删除指定元素
        public boolean contains(E e)：   判断当前集合中是否包含给定元素
        public boolean isEmpty()：   判断当前集合是否为空
        public int size()：  返回集合中元素的个数
        public Object[] toArray()：  把集合中的元素存储到数组中
 */
public class Demo01Collection {

    public static void main(String[] args) {
        //多态
        Collection<String> coll = new ArrayList<String>();
        System.out.println(coll); //重写了toString方法

        coll.add("abc");//一般都返回true，所以可以不用接收
        System.out.println(coll); //[abc]
        coll.add("nt");
        coll.add("sb");
        System.out.println(coll); //[abc, nt, sb]

        //remove()方法删除指定元素，返回一个boolean值
        //若集合中存在该元素，返回true
        //若集合中不存在该元素，返回false
        boolean b1 = coll.remove("sb");
        boolean b2 = coll.remove("sbsb");
        System.out.println("b1 = " + b1 + ", b2 = " + b2); //b1 = true, b2 = false
        System.out.println(coll);

        boolean b3 = coll.contains("abc");
        boolean b4 = coll.contains("sbsb");
        System.out.println("b3 = " + b3 + ", b4 = " + b4); //b3 = true, b4 = false
        System.out.println(coll);

        System.out.println(coll.isEmpty()); //false

        System.out.println(coll.size()); //2

        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); //abc nt
        }
        System.out.println();

        coll.clear();
        System.out.println(coll); //[]
    }

}
