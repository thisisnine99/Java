package day7.datatype;

public class DataType {
    public static void main(String[] args) {
        //  자료형
        //  원시타입, 객체타입
        //  숫자형, 객체형

        //  숫자형
        //  정수  -   byte, short, int, long
        //  실수  -   float, double
        //  논리값( 참 == 1, 거짓 == 0)   -   boolean
        //  문자 -> 단일문자 (아스키코드 a == 97)  -   char


        //  객체형
        //  int[] -> 배열
        //  String -> 문자열 (배열)
        //  class로 만드는 모든 것

        //  형변환 -> 안전한 경우 자동형변환.
        //            위험한 경우 수동형변환.
        //            관계 없는 것끼리는 형변환 x


        //  자바는 객체지향언어
        int num = 10;   //  원시타입(숫자타입)은 객체지향의 혜택을 받을수없다.

        //  숫자타입 -> 객체타입으로 변경가능 (박싱이라고함)
        //  래퍼클래스 -> 숫자타입을 객체타입으로 변경시켜주는 클래스

        //  int의 래퍼클래스
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //  숫자를 객체로 만드는 행위 - 박싱
        Integer iobj = Integer.valueOf(10);

        //  객체를 숫자로 만드는 행위 - 언박싱
        int i = iobj.intValue();

        //  오토박싱, 오토언박싱
        i = iobj;  //  변수 i 는 int타입, 변수 iobj는 Integer타입 오토언박싱이 이루어짐

        Integer iopj2 = 20; //  오토박싱이 이루어짐

        System.out.println(i);
        //  원시타입에 해당하는 자료형에는 모두 래퍼클래스가 존재.
        //  int -> Integer, char -> Character
        //  double -> Double, float -> Float, short -> Short .... 앞글자를 대문자로만 바꾸면됨.

        String str = "hihi";    //  String도 객체타입

    }
}
