package day4.Static;
// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요. 그리고 printValue 함수를 완성시켜주세요.
public class StaticExam2 {
    static int num = 10;
    public static void main(String[] args) {

        System.out.println(num); // 출력 : 10

        printValue("안녕");
        // 출력 : 안녕
    }
    public static void printValue(String a) {
        System.out.println("안녕");
    }

}
