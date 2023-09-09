package day8.AbstractExam;

public class AbstractExam {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.breath();
        d1.sound();

        Cat c1 = new Cat();
        c1.breath();
        c1.sound();
    }
}
abstract class Animal {
    String name = "동물";
    void breath() {
        System.out.printf("%s가 숨을쉰다.\n", name);
    }
    public abstract void sound();
}
class Dog extends Animal {
    void breath() {
    }
    Dog() {
        this.name = "강아지";
    }
    public void sound() {
        System.out.printf("%s가 멍멍소리를 냅니다\n", name);
    }
}
class Cat extends Animal {
    Cat() {
        this.name = "고양이";
    }
    void breath() {
    }
    public void sound() {
        System.out.printf("%s가 야~옹소리를 냅니다\n", name);
    }
}