package day2.Loop;

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
        int height = 10;
        int k = 1;
        for (int i = height - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.printf(" ");
            }
            for (int j = 1; j <= k; j++) {
                System.out.printf("*");
            }
            k++;
            System.out.println(" ");
        }
    }
}
