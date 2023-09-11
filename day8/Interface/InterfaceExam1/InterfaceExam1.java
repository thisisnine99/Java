package day8.Interface.InterfaceExam1;

public class InterfaceExam1 {
    public static void main(String[] args) {
        ZooKeeper z1 = new ZooKeeper();
        Lion L1 = new Lion();
        z1.feed(L1);

    }
}

class ZooKeeper {
    void feed(Predator name) {
        System.out.printf("feed %s\n", name.getFood());
    }
}
interface Predator {
    String getFood();
}
class Animal {
    String name;
    void setName(String name) {
        this.name = name;
    }
}
class Lion extends Animal implements Predator {
    public String getFood() {
        return "pig";
    }
}
class Tigger extends Animal implements Predator {
    public String getFood() {
        return "cow";
    }
}