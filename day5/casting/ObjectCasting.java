package day5.casting;

public class ObjectCasting {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Cat c1 = new Cat();

        d1.bark();
        c1.meow();

        Animal a1 = new Animal();
        Cat c2 = new Cat();

        a1 = c2;    //  Cat이 Animal에 대입(x).
                    //  Cat이 Animal로 모습을 바꿨다.
        //  하위(자식)클래스가 상위(부모)클래스로 모습을 바꾸는건 안전.

        a1.move();
        c2.move();

        //  반대로
        a1 = d1;    //  Animal 변수에 Dog가 형변환되어서 대입
        c2 = (Cat)a1;   //  자동형변환x, 수동형변환은 가능

        //  객체는 자식 -> 부모 형변환 안전.
        //  부모 -> 자식은 위험. 수동형변환가능
        //  상속관계 없으면 형변환 X
    }
}

class Animal {
    public void move() {
        System.out.println("움직인다");
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