package day4.Clazz;

public class Clazz {
    public static void main(String[] args) {
        //  1. 클래스가 함수를 모아놓는 느낌
        //  2. 변수를 모아놓는 느낌

        //  변수
        //  사람 표현 -> 이름, 나이, 거주지

        //  배열
        //  키, 몸무게, 나이
        //  person1 175, 60, 22
        //  person2 185, 70, 32

        int[] person1 = {175, 60, 22};
        int[] person2 = {185, 70, 32};

        System.out.printf("person1 : 키 : %d, 몸무게 : %d, 나이 : %d\n", person1[0], person1[1], person1[2]);
        //  배열을 사용하면 -> 같은 자료형만 표현가능. 0번째, 1번째.. 각각 무엇을 가리키는지 알기가 어렵다.
        //  객체 -> 관련된 데이터를 묶는다.


        String name = "홍길동";
        String home = "대전";
        int age = 20;
        System.out.printf("%d살 %s사는 %s입니다\n", age, home, name);

        String name2 = "이순신";
        String home2 = "서울";
        int age2 = 40;
        System.out.printf("%d살 %s사는 %s입니다\n", age2, home2, name2);

        //  데이터를 조각내서 저장하면 사용할때 실수할수도 있다.

        //  객체를 사용한 홍길동의 자기소개.
        Person1 person13 = new Person1();
        person13.name = "홍길동";
        person13.age = 20;
        person13.home = "대전";

        Person1 person14 = new Person1();
        person14.name = "이순신";
        person14.age = 40;
        person14.home = "서울";

        //  출력 문구를 수정할 때 마다 중복작업을 해야한다.
        System.out.printf("%d살 %s사는 %s입니다\n", person13.age, person13.home, person13.name);
        System.out.printf("%d살 %s사는 %s입니다\n", person14.age, person14.home, person14.name);

        //  이를 해결하기위해 함수를 만든다.
//        introduce(person4.age, person4.home, person4.name);
        //  이렇게하면 person4에 들어있는 정보를 하나 하나 넘겨야한다.
//        introduce(person4);

        //  다른 클래스에 있는 함수를 가져온 방법
        //  사용하고자 하는 클래스명.함수명
        person13.introduce();
        person14.introduce();

    }
//    public static void introduce(int age, String name, String home) {
//        System.out.printf("%d살 %s사는 %s입니다\n",age, home, name);
//    }
    //  같은 클래스 내의 함수끼리는 호출(사용) 가능함.
//    public static void introduce(Person person4) {
//        System.out.printf("함수 %d살 %s사는 %s입니다\n", person4.age, person4.home, person4.name);
//    }

}

//  컴퓨터한테 내가 생각한 어떤 개념 -> 컴퓨터한테 알려줘야 함.

//  클래스는 기본적으로 클래스 밖에 만든다.
//  클래스의 본질 -> 관련된 데이터의 묶음 + 해당 데이터를 사용하는 함수
//  인스턴스(복사본, 객체)를 사용하려면 static이 있어서는 안된다.
//  클래스는 현실세계의 개념 및 사물과 1:1 맵핑을 하기위해 있다.

//  객체 -> 개성을 표현하기 위함
//  모든 객체가 공유하는 개념. -> 인류평균나이
class Person1 {
    int age;
    String name;
    String home;

    public void introduce() {
        System.out.printf("안녕하세요 %d살 %s사는 %s입니다\n", age, home, name);
    }
}

