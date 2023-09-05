package day5.inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.breathe();
        d1.move();

        Cat c1 = new Cat();
        c1.meow();
    }
}
//  클래스 단위에서 중복이 발생.
//  상속
//  고양이, 개 -> 포유류, 동물, 생물, ...등등 상위개념으로 묶음
class Animal {
    int age;
    String kind;
    public void breathe() {
        System.out.println("숨쉬다");
    }
    public void move() {
        System.out.println("움직이다");
    }
}
class Dog extends Animal {
    public void bark() {
        System.out.println("멍멍");
    }
}
class Cat extends Animal {
    public void meow() {
        System.out.println("야옹");
    }

}
