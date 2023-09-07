package day7.superExam2;

public class SuperExam2 {
    public static void main(String[] args) {
        Child c1 = new Child("홍꺽정", 15);
    }
}

class Parent {
    String name;
    int age;
    Parent(String name1, int age1) {
        this.age = age1;
        this.name = name1;
        System.out.printf("안녕하세요 %d살 %s입니다", age, this.name);
    }
}

class Child extends Parent {
    String name2;
    int age2;
    Child(String name3, int age3) {
        super(name3, age3);
    }
}
