package day4.Scope;

public class Scope {
    public static void main(String[] args) {
        System.out.println(Person.avgAge);
//        System.out.println(Person.age); //  객체를 만들지 않았기 때문

        Person p1 = new Person();
        System.out.println(p1.age);
//        Person.hi();    //  함수가 static이 아니기때문에 실행이되지않음
        p1.hi();

    }
}

class Person {
    static int avgAge = 100;    //  클래스 변수
    int age = 30;   //  인스턴스 변수

    public void hi() {
        System.out.println("안녕");
    }
}