package cn.nuist.day01.demo05Array;

/*
Java内存划分为5各部分：
    1.栈（stack）：存放的都是方法中的局部变量，方法的运行在栈中
        局部变量：方法的参数，或是方法{}中的变量
        作用域：一旦超出作用域，立马从栈内存中消失
    2.堆（heap）：凡是new出来的东西，都在堆中
        堆内存中的东西都有一个地址：16进制
        堆内存里面的数据，都有默认值，规则：
            1.如果是整数类型，默认为0
            2.如果是浮点类型，默认为0.0
            3.如果是字符类型，默认为'\u0000'
            4.如果是布尔类型，默认为false
            5.如果是引用类型，默认为null
    3.方法区（Method Area）：存储.class相关信息，包含方法的信息
    4.本地方法栈（Native Method Stack）：与操作系统相关
    5.寄存器（pc Register）：与CPU相关。
 */

public class Demo04JavaMemery {
}
