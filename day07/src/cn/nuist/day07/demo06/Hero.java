package cn.nuist.day07.demo06;

public class Hero {

    private String name;
    private Weapon weapon;
    private int age;

    public Hero() {
    }

    public Hero(String name, Weapon weapon, int age) {
        this.name = name;
        this.weapon = weapon;
        this.age = age;
    }

    public void attack() {
        System.out.println("年龄为：" + age + "的" + name + "使用了" + weapon.getCode() + "发起了攻击");
        System.out.println(weapon); //cn.nuist.day07.demo06.Weapon@4f023edb
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
