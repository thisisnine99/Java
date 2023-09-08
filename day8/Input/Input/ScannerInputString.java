package day8.Input.Input;

import java.util.Scanner;

public class ScannerInputString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 한단어를 읽어오는 방법
        String str = sc.next();
        System.out.println("당신이 입력한 단어는 : " + str);
        //  공백을 포함한 한 문장을 가져오는 방법

        sc.nextLine();

        String str2 = sc.nextLine();
        System.out.println("당신이 입력한 문장은 : " + str2);

    }
}
