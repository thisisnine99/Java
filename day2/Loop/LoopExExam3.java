package day2.Loop;

public class LoopExExam3 {
    public static void main(String[] args) {
        // 출력
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
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
