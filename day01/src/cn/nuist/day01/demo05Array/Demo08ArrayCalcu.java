package cn.nuist.day01.demo05Array;

public class Demo08ArrayCalcu {

    public static void main(String[] args) {

        //数组的遍历输出
        int[] array = { 15, 25, 35, 45, 50 };
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //求数组的最值
        int Max = array[0];
        int Min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < Min)
                Min = array[i];
            if (array[i] > Max)
                Max = array[i];
        }
        System.out.println("最小值：" + Min);
        System.out.println("最大值：" + Max);

        //数组元素反转
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("================");

        for (int min = 0, max = array.length - 1; min < max; min++, max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
