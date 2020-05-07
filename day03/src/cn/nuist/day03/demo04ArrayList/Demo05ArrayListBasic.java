package cn.nuist.day03.demo04ArrayList;

import java.util.ArrayList;

/*
如果希望向集合ArrayList中存储基本类型，必须使用基本类型对应的包装类

基本类型     包装类（引用类型，位于java.lang包下）
byte        Byte
short       Short
int         Integer     【特殊】
long        Long
float       Float
double      Double
char        Character   【特殊】
boolean     Boolean

从jdk1.5开始，支持自动装箱，自动拆箱
    自动装箱：基本类型 --> 包装类型
    自动拆箱：包装类型 --> 基本类型
 */
public class Demo05ArrayListBasic {

    public static void main(String[] args) {

        ArrayList<String> listA = new ArrayList<>();
        //错误写法！ArrayList中只能存放引用类型，不能存放基本类型
        //ArrayList<int> listB = new ArrayList<>();

        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(100);
        listB.add(200);
        System.out.println(listB);

        int num = listB.get(1);
        System.out.println("第1号元素是：" + num);
    }
}
