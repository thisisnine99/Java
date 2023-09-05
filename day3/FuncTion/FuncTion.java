package day3.FuncTion;

public class FuncTion {

    //  함수 정의
    //  void - 리턴타입
    //  test - 함수명
    //  () - 매개변수
    public static void test(int a) {
        System.out.println("코드1");
        System.out.println("코드2");
        System.out.println("코드3");

        return;

//        함수가 끝나면 호출한 부분으로 리턴한다.
    }

    public static void plus(int num1, int num2, int num3) { //  매개변수

        int result = num1 + num2 + num3;

        System.out.println(result);
    }

    // main 함수
    public static void main(String[] args) {
        System.out.println("main 함수 시작");
        //  함수
        //  코드 저장소
        //  입력 -> <처리> -> 출력

        // 변수
//        int a;  //  변수선언
//        a = 2;  //  초기화
//
//        System.out.println(a);
//        System.out.println(a);
//        System.out.println(a);

        //  함수 - 코드단위로 저장 (변수와 비슷함)
        //  함수
        //  1. 함수는 코드 저장소
        //  2. 함수는 정의해야 한다. -> 함수 정의 문법 사용
        //      - 규칙 1. 함수는 클래스 안에서 정의해야 한다. ( 함수 안에 함수 정의 x)
        //      - 규칙 2. 리턴타입, 함수명, 매개변수를 지정해야 한다.
        //      - 규칙 3. 같은 이름의 함수를 2개 이상 만들지 않는다.
        //      - 규칙 4. 함수는 호출(사용) 해야만 실행된다.
        //      - 규칙 5. 함수의 개수는 제한이 없음.

        //  정의된 함수를 호출 (사용)
        //  1. 함수의 가장 큰 사용 목적 -> 코드의 재사용


        //  함수의 확장 -> 매개변수
        plus(10, 20, 21);
        plus(100, 200, 21);


        System.out.println("main 함수 끝");
    }
}
