package day8.Input.InputExam3;

import java.util.Scanner;

public class InputExam3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


//        int age2 = scan.nextLine();   이렇게는 안된다. age2는 int nextLIne은 String
        //  문자를 -> 숫자로 변환
        //  관련 없는 타입끼리는 형변환 X
        //  Integer 래퍼클래스 사용
        int num = Integer.parseInt(scan.nextLine());    //  parseInt를 통해 문자로된 숫자를 실제 숫자로 변경함
        System.out.printf("%d\n", num);

        System.out.printf("나이를 입력해주세요:");
        int age = scan.nextInt();

        scan.nextLine();    //  버퍼비우기용

        System.out.printf("이름을 입력해주세요:");
        String name = scan.nextLine();
        System.out.printf("안녕하세요 %d세 %s입니다.\n", age, name);

        // 이름을 입력해주세요 : 홍길동
        // 나이를 입력해주세요 : 29
        // 출력 : 안녕하세요 29세 홍길동입니다.

    }
}
