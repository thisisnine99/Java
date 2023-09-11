package day8.Interface.InterfaceExam2;
/* 상황
카페에왔는데 아메리카노 라떼 스무디 등 여러가지 음료를 시켰는데 이 음료들을 각각 다 만들어서
주문한 사람들에게 줘야한다.
 */
public class InterfaceExam2 {
    public static void main(String[] args) {
        Cafe c1 = new Cafe();
        Americano a1 = new Americano();
        a1.setPrice(5000);
        c1.sell(a1.getPrice());
    }
}
class Cafe {
    void sell(int price) {
        System.out.printf("%d원 가격의 음료를 판매하였습니다\n", price);
    }

}
interface Caffeine {
    int getPrice();
}
class Drink {
    int price;
    void setPrice(int price) {
        this.price = price;
    }
}
class Americano extends Drink implements Caffeine {
    public int getPrice() {
        return this.price;
    }
}
class Latte extends Drink implements Caffeine {
    public int getPrice() {
        return this.price;

    }
}