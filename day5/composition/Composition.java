package day5.composition;

public class Composition {
    public static void main(String[] args) {
        홍길동 a홍길동 = new 홍길동();
        a홍길동.자바_프로그래밍();

        홍길순 a홍길순 = new 홍길순();
        a홍길순.자바_프로그래밍();

        이순신주식회사 a회사 = new 이순신주식회사();
    }
}

class 이순신주식회사 {
}
//  홍길동 -> C언어, 자바
//  조합, 구성 -> 객체들의 조합을 통해 클래스를 만드는 방식
class 홍길동 {
    홍길순 a홍길순 = new 홍길순();
    public void C언어_프로그래밍() {
        System.out.println("C언어 프로그램개발");
    }
    public void 자바_프로그래밍() {
        System.out.println("자바8 프로그램개발");
    }
}

//  홍길순 -> 파이썬, 자바
class 홍길순 {
    public void 자바_프로그래밍() {
        System.out.println("자바8 프로그램개발");
    }
    public void 파이썬_프로그래밍() {
        System.out.println("파이썬3.13 프로그램개발");
    }
}
