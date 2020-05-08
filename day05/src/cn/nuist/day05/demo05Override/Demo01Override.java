package cn.nuist.day05.demo05Override;

/*
重写(Override)
    概念：在继承关系中，方法的名称一样，返回值、参数列表也一样
    特点：创建的是子类对象，则优先用子类方法

注意事项：
    1.必须保证父子类之间方法的名称相同，参数列表也相同

    2.@Override：写在方法前面，用来检测是不是有效的Override
        这个注解只是用来检测覆写是否正确，不写也行

    3.子类方法的返回值必须【小于等于】父类方法的返回值范围
        提示：Object类是所有类的公共最高父类，java.lang.String是Object的子类

    4.子类方法的权限必须【大于等于】父类方法的权限修饰符
        提示：public > protected > (default) > private
        备注：(default)不是关键字default，而是什么都不写

区分重载(Overload)：方法的名称一样，返回值一样，参数列表【不一样】
 */
public class Demo01Override {

}
