package day6.constructor;

public class Constructor {
    public static void main(String[] args) {
//        Person p1 = new Person();


        //  올바른 데이터 세팅 <---- 반.드.시. 필요
//        p1.age = 20;
//        p1.name = "홍길동";
//        p1.myCar = new Car();
        //  위 과정을 객체 초기화 (initialize)

        //  초기화 과정을 조금 더 편하게 개선 -> 메서드로 제작
//        p1.init(20, "홍길동", new Car());

        //  객체를 만들면 무조건 실행하는 메서드 -> 생성자
//        Person p3 = new Person();   //  Person() -> 메서드(생성자)

        //  객체의 함수는 데이터를 이용해서 기능을 수행.
        //  데이터가 있어야 함수가 올바르게 작동한다.
//        p1.introduce();
//        p1.drive();

    }
}
class Person {
    int age;
    String name;
    Car myCar;
    //  생성자
    //  리턴타입 X, 메서드명 = 클래스명
    public Person(int age, String name, Car myCar) {
        System.out.println("사람 한명 생성");
//        age = age;    //  자기거를 우선으로 쓴다. 위에 매개변수로 들어온 age에 age를 넣는다는 의미.
//        name = name;
//        myCar = myCar;

        this.age = age;
        this.name = name;
        this.myCar = myCar;
    }
    public void introduce() {
        System.out.printf("안녕하세요 저는 %d살 %s입니다\n", age, name);
    }
    public void drive() {
        myCar.use();
    }
    public void init(int param1, String param2, Car param3) {
        age = param1;
        name = param2;
        myCar = param3;
    }
}
class Car {
    public void use() {
        System.out.println("자동차를 타고 나갑니다");
    }
}
