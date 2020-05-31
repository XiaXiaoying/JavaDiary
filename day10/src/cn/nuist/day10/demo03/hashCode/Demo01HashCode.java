package cn.nuist.day10.demo03.hashCode;

/*
    哈希值(hashCode)：是一个十进制的整数，由系统随即给出（实际上就是对象的逻辑地址值）
    在Object类中有一个方法，可以获取对象的hashCode：
    int hashCode() 源码：
        @HotSpotIntrinsicCandidate
        public native int hashCode();
    native：代表该方法调用本地操作系统的方法

    toString() 方法源码：
        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
 */
public class Demo01HashCode {

    public static void main(String[] args) {
        Person person1 = new Person();
        int h1 = person1.hashCode();
        System.out.println(h1); // 284720968
        System.out.println(person1.toString()); // cn.nuist.day10.demo03.hashCode.Person@10f87f48

        Person person2 = new Person();
        int h2 = person2.hashCode();
        System.out.println(h2); // 189568618
        System.out.println(person2.toString()); // cn.nuist.day10.demo03.hashCode.Person@b4c966a

        // 重写了hashCode方法
        Integer i1 = 1;
        Integer i2 = 1;
        System.out.println(i1.hashCode()); // 1
        System.out.println(i2.hashCode()); // 1

        /*
            String类的哈希值
                String类重写了Object类的hashCode方法
         */
        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = new String("efg");
        System.out.println(str1.hashCode()); // 96354
        System.out.println(str2.hashCode()); // 96354
        System.out.println(str3.hashCode()); // 100326

    }

}
