package day2;

public class Operator {
    public static void main(String[] args) {

//        int num = 30;
//        // num 의 값을 절반으로감소
//        num /= 2;
//        System.out.println(num);
//
//        // 1증가
//        num += 1;
//        System.out.println(num);
//        num++;
//        System.out.println(num);
//
//        // 1감소
//        num -= 1;
//        System.out.println(num);
//        num --;
//        System.out.println(num);
//
//        // 논리 연산
//
//        // 곱연산(and) - &&
//        // 모두 참이면 참, 그외 거짓
//        System.out.println(true && false);
//        System.out.println(false && false);
//        System.out.println(false && true);
//        System.out.println(true && true);
//
//        // 합연산(or) - ||
//        // 모두 거짓이면 거짓, 그외 참
//        System.out.println(true || false);
//        System.out.println(false || false);
//        System.out.println(false || true);
//        System.out.println(true || true);

        // 조건문 -> 택일구조

        // 양자택일 (이지선다)
        boolean isMale = true;
        if (isMale) {
            System.out.println("남자");
        } else {
            System.out.println("여자");
        }

        // 삼자택일 (삼지선다)
        // 초중고, 직좌우, ...
        int age2 = 19;
        if (age2 >= 8 && age2 <= 13) {
            System.out.println("초등학교"); // 8 ~ 13
        } else if (age2 <= 16) {
            System.out.println("중학교"); // 14 ~ 16
        } else if (age2 <= 19) {
            System.out.println("고등학교"); // 17 ~ 19
        } else {
            System.out.println("성인");
        }

        // 오자택일 (사지선다)
        // 대학성정 (A,B,C,D,F)
        // 90 ~ 100 -> A
        // 80 ~ 89 -> B
        // 70 ~ 79 -> C
        // 60 ~ 69 -> D
        // 59 이하 -> F
        int number = 100;
        if (number >= 90 && number <= 100) {
            System.out.println("A");
        } else if (number >= 80 && number <= 89) {
            System.out.println("B");
        } else if (number >= 70 && number <= 79) {
            System.out.println("C");
        } else if (number >= 60 && number <= 69) {
            System.out.println("D");
        } else if (number <= 59) {
            System.out.println("F");
        }

    }
}
