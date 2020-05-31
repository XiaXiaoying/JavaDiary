package cn.nuist.day08.demo01;

/*
boolean equals(Object obj)只是其他某个对象是否与此对象"相等"
源代码：
        public boolean equals(Object obj) {
            return (this == obj);
        }
注意：
    1.对于基本类型，equals()方法比较的是值
        注意：只能传递对象，只是封装类重写了这个方法，比较值
      对于引用类型，equals()方法比较的是两个对象的地址

 */
public class Demo01Equals {

    public static void main(String[] args) {
        Person person1 = new Person("sb",18);
        Person person2 = new Person("sb",18);
        Object obj = new Person("sb",18);
        //重写前，比较的是是否指向同一对象，false
        //重写后，比较的是对象的内容，true
        System.out.println(person1.equals(person2)); //true

        System.out.println(person1.equals(obj)); //true
        System.out.println(obj.equals(person1)); //true，对于成员方法，编译看左边，运行看右边

        Integer i = 1, j = 1;
        System.out.println(i.equals(j)); //true，实际上调用的是子类Integer类中的重写方法，传递的是对象，比较的是值

    }

}
