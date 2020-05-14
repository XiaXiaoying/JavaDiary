package cn.nuist.day07.demo06;

public class DemoMain {

    public static void main(String[] args) {

        Hero hero = new Hero();
        hero.setName("sb");
        hero.setAge(20);

        Weapon weapon = new Weapon("sb之剑");
        hero.setWeapon(weapon);
        hero.attack();
    }

}
