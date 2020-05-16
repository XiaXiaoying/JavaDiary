package cn.nuist.day09.demo03Generic;

/*

 */
public class Demo02GenericClass {

    public static void main(String[] args) {

        //不用泛型，默认为Object类型
        GenericClass obj = new GenericClass();
        obj.setName("abc");
        Object obj1 = obj.getName();


        //使用泛型Integer
        GenericClass<Integer> i = new GenericClass<>();
        i.setName(1);
        Integer name1 = i.getName();
        System.out.println(name1);


        //使用泛型String
        GenericClass<String > gc = new GenericClass<>();
        gc.setName("aaa");
        String name = gc.getName();
        System.out.println(name);
    }

}
