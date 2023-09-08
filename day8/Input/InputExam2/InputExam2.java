package day8.Input.InputExam2;

import java.util.Scanner;

public class InputExam2 {
    public static void main(String[] args) {

        // Scanner를 이용해 입력값을 받아
        // 구구단을 원하는 단이 나오게 해주세요.

        //예시) 원하는 단을 입력해주세요 : 4 (입력후 엔터)

        // 4단 출력.
        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();
        System.out.printf("=====%d단 출력=====\n", dan);
        for (int i = 2; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                if (i == dan) {
                    System.out.printf("%d * %d = %d\n", i, j, i*j);
                }
            }
        }

    }
}
