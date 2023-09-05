package day3.array;

public class Array2 {
    public static void main(String[] args) {

        //  2차원 배열 -> 배열의 배열
        //  2차원 배열[큰방][작은방]

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};
        int[] arr3 = {9, 10, 11, 12};

        int[][] darr = {arr1, arr2, arr3};

        System.out.println(darr[0][1]);

        //  2차원 배열 선언
        int[][] darr2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(darr2[0][3]);

        //  2차원 배열 순회
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d번 배열\n", i);
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d ", darr2[i][j]);
            }
            System.out.println();
        }
    }
}
