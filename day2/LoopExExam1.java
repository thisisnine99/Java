package day2;

// 문제 : 구구단 작성
// 조건 : 짝수번째만 곱하기
/* 출력예시 :
  2 * 2 = 4
  2 * 4 = 8
  2 * 6 = 12
  2 * 8 = 16
  ...

  9단까지 이런식으로 나오면 됩니다.

*/
public class LoopExExam1 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            System.out.printf("====%d단====\n", i);
            for (int j = 2; j <= 8; j++) {
                if (j % 2 == 0) {
                    System.out.printf("%d * %d = %d\n", i, j, i * j);
                }
            }
        }

    }
}
