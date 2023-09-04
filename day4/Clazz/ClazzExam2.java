package day4.Clazz;
// 문제 : 자동차 객체를 담을 변수를 만들어주세요.
// 자동차 객체를 변수에 담고 그 변수를 이용해 최고속력이 서로 다르게 만들어주세요.
// 각 자동차가 자신의 최고속력으로 달리게 해주세요.

public class ClazzExam2 {
    public static void main(String[] args) {
        // 출력 : 자동차가 최대속력 220km로 달립니다.
        // 출력 : 자동차가 최대속력 250km로 달립니다.
        Car2 car1 = new Car2();
        car1.MaxSpeed = 220;
        car1.CarNum = 1;
        car1.run();

        Car2 car2 = new Car2();
        car2.MaxSpeed = 250;
        car2.CarNum = 2;
        car2.run();
    }
}
class Car2 {
    int MaxSpeed;
    int CarNum;
    public void run() {
        System.out.printf("%d번 자동차가 최대속력 %dkm로 달립니다.\n", CarNum, MaxSpeed);
    }

}
