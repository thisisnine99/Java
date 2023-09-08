package day8.Input.Input;

import java.io.IOException;
import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {

//        int a = 10;
//        System.out.println(a);  //  표준 출력

        Scanner sc = new Scanner(System.in);

        //  입력이 필요한 경우
        int num = sc.nextInt();   //  입력된 숫자를 하나 읽어옴.
        System.out.println("당신이 입력한 숫자는 : " + num);


    }
}
