package day6.exam.exam2;

public class Exam2 {
    public static void main(String[] args) {
        계산기 a계산기 = new 계산기();

        System.out.println(a계산기.더하기(10, 20));
        // 출력 : 30

        System.out.println(a계산기.더하기(10, 20, 30));
        // 출력 : 60

        System.out.println(a계산기.더하기(10.5, 20, 30));
        // 출력 : 60.5
    }
}
class 계산기 {
    int 더하기 (int a, int b) {
        int result = a + b;
        return result;
    }
    int 더하기 (int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
    double 더하기 (double a, int b, int c) {
        double result = a + b + c;
        return result;
    }
}
