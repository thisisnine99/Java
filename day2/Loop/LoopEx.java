package day2.Loop;

public class LoopEx {
    public static void main(String[] args) {

        // 2중 반복문

        System.out.println("----2중 반복문 사용----");
        for (int i = 1; i <= 3; i++) {
            System.out.printf("=== %d회차 ===\n", i);
            for (int j = 1; j <= 5; j++) {
                System.out.println(j);
            }
        }

        // 2. 직사각형 만들기
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

    }
}
