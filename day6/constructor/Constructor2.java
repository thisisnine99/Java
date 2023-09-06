package day6.constructor;

public class Constructor2 {
    public static void main(String[] args) {
        //  1. 편해짐
        //  2. 코드가 줄어듬
        //  3. 초기화 실수로 잊고 안할수가 없음.

        Person p1 = new Person(20, "홍길동", new Car());
        p1.introduce();
        p1.drive();

        Person p2 = new Person(33, "이순신", new Car());
        p2.introduce();
        p2.drive();
    }
}
