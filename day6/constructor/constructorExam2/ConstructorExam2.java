package day6.constructor.constructorExam2;
// 출력 : 아래와 같이 출력되게 해주세요.
public class ConstructorExam2 {
    public static void main(String[] args) {
        사람 a사람 = new 사람(10, new 팔(), 100);

        System.out.println(a사람.a왼팔.길이 + "cm");
        // 출력 : 100cm
    }
}
class 사람 {
    int 나이;
    팔 a왼팔;
    public 사람 (int age, 팔 팔, int length) {
        this.나이 = age;
        this.a왼팔 = 팔;
        this.a왼팔.길이 = length;

    }
}
class 팔 {
    int 길이;
}
