package day2;

// a b 두 수가 주어지면 a와 b사이의 수를 오름차순 출력해주세요.
// 오름차순은 작은 수 부터 큰수로 정렬되는 것을 말합니다.
// ex )
// 오름차순 :  1, 2, 3, 4, 5
// 내림차순 :  5, 4, 3, 2, 1
public class Exam4 {
    public static void main(String[] args) {
        int a = 111;
        int b = 123;

        if (b < a) {
            for (int i = b; i <= a; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        }
    }
}
