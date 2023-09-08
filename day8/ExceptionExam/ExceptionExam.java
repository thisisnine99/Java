package day8.ExceptionExam;

public class ExceptionExam {
    public static void main(String[] args) {


        //  예외처리

        //  컴파일 타임 -> 컴파일 오류
//        int a = "hihi"
        //  문법오류

        //  런타임(프로그램 실행중) -> 런타임 에러
        //  에러 -> 시스템, 네트워크, 머신 등등 여러가지 이유...
        //  예외 -> 프로그래머의 실수

        //  갑자기 꺼지지 않게 우회 -> 예외처리
        System.out.println("Hi~");
        try {   //  예외가 발생할 만한 지점을 try로 감싼다.
            int[] arr = new int[3];
            arr[10] = 20; //  프로그래머의 실수
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 작업 할 때 문제 있는거 같은데 확인해봐");
        }
        System.out.println("Bye~");

        //
    }
}
