package day1;

public class Variable {
    public static void main(String[] args) {

        // 홍길동의 나이를 저장했다가 필요할 때 사용

        // 값을 저장하는 상자(그릇) - 변수
        // 변수를 만들 때는 크기와 모양 결정
        // 변수를 만들 때는 변수의 이름 필요

        //값 -> 숫자(int), 문자(String)


        System.out.println("안녕하세요 저는 24살 홍길동입니다.");

        //홍길동의 나이를 한번만 사용해서
        int age = 26;
        System.out.println("안녕하세요 저는 " + age + "살 홍길동입니다.");
        System.out.printf("안녕하세요 저는 " + age + "살 홍길동입니다.\n");
        System.out.printf("안녕하세요 저는 %d살 홍길동입니다.\n", age);



    }
}
