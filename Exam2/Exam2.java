package Exam2;

public class Exam2 {
    public static void main(String[] args) {

        // 높이를 입력해주세요 : 3                // 출력
        int height = 3;
        for (int i = 0; i < height; i++) {
            for (int j = height; j>i; j--) {
                System.out.printf(" ");
            }
            for (int j = 0; j<=2*i; j++){
                System.out.printf("*");
            }
            System.out.println();
            System.out.println();
        }

        /*

           *

          ***

         *****

         */

        // 높이를 입력해주세요 : 5
        height = 5;
        for (int i = 0; i < height; i++) {
            for (int j = height; j>i; j--) {
                System.out.printf(" ");
            }
            for (int j = 0; j<=2*i; j++){
                System.out.printf("*");
            }
            System.out.println();
            System.out.println();
        }

        // 출력

        /*

             *

            ***

           *****

          *******

         *********

         */

        // 높이를 입력해주세요 : 7
        height = 7;
        for (int i = 0; i < height; i++) {
            for (int j = height; j>i; j--) {
                System.out.printf(" ");
            }
            for (int j = 0; j<=2*i; j++){
                System.out.printf("*");
            }
            System.out.println();
            System.out.println();
        }
        // 출력

        /*

               *

              ***

             *****

            *******

           *********

          ***********

         *************

         */

    }

}

