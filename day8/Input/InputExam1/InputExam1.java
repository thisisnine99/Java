package day8.Input.InputExam1;

import java.util.Scanner;

//Scanner를 이용해서 아래와 같이 입출력 하여 사칙연산을 수행해주세요.
//입출력 예시
//첫번째 숫자를 입력해주세요: 12
//두번째 숫자를 입력해주세요: 33
//12 + 33 = 45
public class InputExam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력해주세요");
        int num1 = sc.nextInt();

        System.out.println("두번째 숫자를 입력해주세요");
        int num2 = sc.nextInt();
        System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);

    }
}
