package day2;
// 문제 : 1부터 100까지 출력해주세요.
public class Exam1 {
    public static void main(String[] args) {
        System.out.println("---while문---");
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }

        System.out.println("---for문---");
        for ( int j = 1; j <= 100; j++) {
            System.out.println(j);
        }
        // 출력
        // 1
        // 2
        // 3
        // 4
        // 5
        // ...
        // 100
    }
}
