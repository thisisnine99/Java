package day2;

public class 조건문수업 {
    public static void main(String[] args) {

        //야식

        int money = 2500;
        //소지금이 20000원 이상일 때
        if (money >= 20000) {
            System.out.println("치킨");
        }

        // 소지금이 20000원 미만, 2000원 이상일 때
        // 논리 연산자 사용 x
        if (money < 20000) {
            if (money >= 2000) {
                System.out.println("포카칩");
            }
        }
        if (money >= 2000) {
            System.out.println("포카칩");
        } else {
            System.out.println("구매불가");
        }

        if (money >= 2000 && money < 20000) {
            System.out.println("포카칩");

        }

        //할인대상 -> 19세 이하, 60세 이상 할인 대상
        int age = 59;

        if (age <= 19) {
            System.out.println("할인대상입니다.");
        }
        if (age >= 60) {
            System.out.println("할인대상입니다.");
        }
        if (age > 19) {
            if (age < 60) {
                System.out.println("할인대상이 아닙니다.");
            }
        }


    }
}
