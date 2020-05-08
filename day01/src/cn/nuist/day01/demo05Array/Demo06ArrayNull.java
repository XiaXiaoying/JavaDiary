package cn.nuist.day01.demo05Array;

/*
所有引用类型都可以赋值null，但代表什么都没有

数组必须进行new初始化才能使用用其中元素
若只赋值null，则会出现NullPointerException 空指针异常
 */
public class Demo06ArrayNull {
    public static void main(String[] args) {
        int[] array = null;
        //array = new int[3];
        System.out.println(array[1]);
    }
}
