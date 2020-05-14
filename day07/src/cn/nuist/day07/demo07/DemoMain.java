package cn.nuist.day07.demo07;

public class DemoMain {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("sb");

        //使用单独定义的实现类
//        hero.setSkill(new SkillImpl());

        //简化，使用匿名内部类
//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("piapiapia");
//            }
//        };
//        hero.setSkill(skill);

        //进一步简化，同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("papapa");
            }
        });

        hero.attack();
    }

}
