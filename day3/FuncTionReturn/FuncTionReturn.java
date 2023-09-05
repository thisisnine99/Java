package day3.FuncTionReturn;

public class FuncTionReturn {
    public static double 원의넓이(int n) {
        double result = n * n * 3.14;

        return result;
    }

//    public static void 원의넓이나누기(int a, int b) {
//        System.out.println(a * a * 3.14 / b);
//    }
//
//    public static void 원의넓이곱하기(int a, int b) {
//        System.out.println(a * a * 3.14 * b);
//    }

    public static void main(String[] args) {
        //  함수에서 리턴할 때 값을 하나 가지고 올 수 있다. -> 리턴값
        //  리턴 -> 함수가 작업한 결과를 직접 받을 수 있음.
        //  함수의 결과를 2차 가공할 수 있음.

        //  모든 값 -> 자료형
        //  1 -> int
        //  3.14 -> double
        //  "Hello" -> String
        //  true -> boolean


        //  1. 반지름으로 원의 넓이를 구하는 함수 만들기.
        //      - 원의 넓이 구하는공식 : 반지름 * 반지름 * 3.14

        //  2. 반지름이 5인 원의 넓이를 구해서 출력
        System.out.println(원의넓이(5));

        //  3. 반지름이 5인 원의 넓이를 2로 나눈 값.
//        원의넓이나누기(5,2);
        System.out.println(원의넓이(5) / 2);


        //  4. 반지름이 5인 원의 넓이를 2 곱한 값.
//        원의넓이곱하기(5,2);
        System.out.println(원의넓이(5) * 2);

    }
}
