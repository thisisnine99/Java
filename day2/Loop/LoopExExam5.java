package day2.Loop;

public class LoopExExam5 {
    public static void main(String[] args) {
        /*
           *
          ***
         *****
        y = 5;
             *
            ***
           *****
          *******
         *********
        y = 7;
               *
              ***
             *****
            *******
           *********
          ***********
         *************
         */
        int y = 7;

//        int k = 1;
//        for (int i = 1; i <= 2 * y; i += 2) {
//            for (int j = 0; j < y - k; j++) {
//                System.out.printf(" ");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.printf("*");
//            }
//            System.out.println();
//            k++;
//        }


        int k = y;
        for (int i = 0; i < 2 * y; i += 2) {
            for (int j = k - 1; j >= 0; j--) {
                System.out.printf(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
            k--;
        }

    }
}
