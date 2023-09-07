package day7.superExam1;

public class SuperExam1 {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.자기소개();
    }
}

class Parent {
    String name = "홍길동";
}

class Child extends Parent {
    String name = "홍꺽정";
    void 자기소개() {
        System.out.printf("안녕하세요 저는 %s의 아들 %s입니다.", super.name, name);
    }
}