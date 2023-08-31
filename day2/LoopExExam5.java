package day2;

public class LoopExExam5 {
    public static void main(String[] args) {
        int y = 7;
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
        for (int i = 0; i < 2*y; i+=2) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
