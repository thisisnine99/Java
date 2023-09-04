package day4.Clazz;
// 문제 : 자동차가 3번 달리게 해주세요.
// 출력 : 자동차가 달립니다.
public class ClazzExam1 {
    public static void main(String[] args) {
        //v1. 1개의 자동차가 3번 달리게 해주세요.

        //v2. 3개의 자동차가 1번씩 달리게 해주세요.

        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        System.out.println("======v1======");
        Car1 car1 = new Car1();
        car1.run(1,3);

        System.out.println("======v2======");
        Car1 car12 = new Car1();
        car12.run(2,1);

        Car1 car13 = new Car1();
        car13.run(3,1);

        Car1 car14 = new Car1();
        car14.run(4,1);
    }
}
class Car1 {
    public void run(int num, int time) {
        for(int i = 1; i <= time; i++) {
            System.out.printf("%d번 자동차가 달립니다\n", num);
        }
    }
}
