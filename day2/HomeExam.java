package day2;

public class HomeExam {
    public static void main(String[] args) {
        System.out.println("============while문============");
        int dan = 2;
        while (dan <= 9) {
            System.out.printf("=== %d단 ===\n", dan);
            int num = 1;
            while (num <= 9) {
                System.out.printf("%d * %d = %d\n", dan, num, dan*num);
                num++;
            }
            dan++;
        }
        System.out.println("============for문============");
        for (int dan2 = 2; dan2 <= 9; dan2++) {
            System.out.printf("=== %d단 ===\n", dan2);
            for (int num = 1; num <= 9; num++ ){
                System.out.printf("%d * %d = %d\n", dan2, num, dan2*num);
            }
        }
    }
}
