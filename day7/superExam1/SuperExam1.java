package day7.superExam1;

public class SuperExam1 {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.name = "홍길동";
        c1.super.name = "임꺽정";

    }
}

class Parent {
    String name;
}

class Child extends Parent {
    String name;
}