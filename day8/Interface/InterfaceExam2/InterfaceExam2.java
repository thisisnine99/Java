package day8.Interface.InterfaceExam2;

public class InterfaceExam2 {
    public static void main(String[] args) {
        Dog d1 = new Dog("바둑이");
        d1.eat();
        d1.sleep();

        Cat c1 = new Cat("나비");
        c1.eat();
        c1.sleep();

    }
}
interface AnimalBehavior{
    void eat();
    void sleep();
}
class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
}
class Cat extends Animal implements AnimalBehavior {
    Cat(String name) {
        super(name);
    }
    public void eat() {
        System.out.println(name + "는 고양이밥을 먹습니다");
    }
    public void sleep() {
        System.out.println(name + "는 쿠션에서 잠을잡니다");
    }
}
class Dog extends Animal implements AnimalBehavior {
    Dog(String name){
        super(name);
    }
    public void eat() {
        System.out.println(name + "는 강아지사료를 먹습니다");
    }
    public void sleep() {
        System.out.println(name +  "는 바닥에서 잠을잡니다");
    }
}