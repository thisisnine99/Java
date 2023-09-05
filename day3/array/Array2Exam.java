package day3.array;

public class Array2Exam {
    public static void main(String[] args) {
        int[][] darr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9,10,11,12},
                {13,14,15,16},
        };
        // 1. 다음과 같이 출력되게 해주세요.
    /*
    4 3 2 1
    8 7 6 5
    12 11 10 9
    16 15 14 13
    */
        System.out.println("시작");
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j >= 0; j--) {
                System.out.printf("%d ", darr[i][j]);
            }
            System.out.println();
        }

        // 2. 다음과 같이 출력되게 해주세요.
    /*
    16 12 8 4
    15 11 7 3
    14 10 6 2
    13 9 5 1
    */
        System.out.println("시작");
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j >= 0; j--) {
                System.out.printf("%d ", darr[i][j]);
            }
            System.out.println();
        }
    }
}
