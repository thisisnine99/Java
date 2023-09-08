package day8.Generic;

public class Generic {
    public static void main(String[] args) {
        저장소<Integer> a저장소1 = new 저장소();
        a저장소1.setData(30);
        int a = (int) a저장소1.getData();
        System.out.println(a);

        저장소<Integer> a저장소 = new 저장소<>();
        a저장소.setData(10);
        int num1 = a저장소.getData();
        System.out.println(num1);

        저장소<Double> b저장소1 = new 저장소();
        b저장소1.setData(5.5);
        double b = (double) b저장소1.getData();
        System.out.println(b);

        저장소<사과> 사과저장소1 = new 저장소();
        사과저장소1.setData(new 사과());
        사과 c = 사과저장소1.getData();
        System.out.println(c);

    }
}
//  자료형을 정해 놓지 안는다. -> 제너릭
//  타입매개변수를 사용. -> <타입변수>
//  똑같은 기능인데 타입이 달라 클래스가 여러개 생기는것을 해결하기 위해 도입
//  일반적으로 자료형은 명확한 것이 좋다. 따라서 Object로 모든 것을 저장하는 것보다
//  가능하면 배열처럼 동등한 자료형끼리 저장하고 사용하는 것이 편하다


class 저장소<T> {
    private T data; //  실행을하면 어차피 T가 Object로 변경된다.

    void setData(T inputedData) {
        this.data = inputedData;
    }

    T getData() {
        return data;
    }
}
class 사과 {

}