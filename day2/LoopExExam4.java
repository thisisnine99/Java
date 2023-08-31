package day2;

public class LoopExExam4 {
    public static void main(String[] args) {
    /*
    높이 : [3]
      *
     **
    ***
    높이 : [5]
        *
       **
      ***
     ****
    *****
    높이 : [7]
          *
         **
        ***
       ****
      *****
     ******
    *******
    */
        int height = 7;
        int k = 0;
        for (int i = height-1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.printf(" ");
                k++;
                }
            for (int l = 1; l <= k; l++){
                System.out.printf("*");
            }
            System.out.println();
        }

    }
}
