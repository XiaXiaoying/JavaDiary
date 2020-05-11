package cn.nuist.day07.demo03InnerClass;

public class Body { //外部类

    public class Heart { //成员内部类

        public void beat() {
            System.out.println("内部类方法");
            System.out.println(name);
        }

    }

    private String name;

    public void methodBody() {
        System.out.println("外部类方法");
        Heart heart = new Heart();
        heart.beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
