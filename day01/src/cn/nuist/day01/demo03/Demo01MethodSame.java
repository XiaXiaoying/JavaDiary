package cn.nuist.day01.demo03;

public class Demo01MethodSame {

    public static void main(String[] args) {
        System.out.println(isSame(3,4));
        System.out.println(isSame(4,4));
    }


    public static boolean isSame(int a, int b) {
/*      if (a == b) {
            return true;
        } else {
            return false;
        }不好
*/

/*      boolean same;
        if(a ==b) {
            same = true;
        } else {
            same = false;
        }
        return same;不够简单
*/

        return a == b;

    }


}
