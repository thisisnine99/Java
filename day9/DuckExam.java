package day9;

public class DuckExam {
    public static void main(String[] args) {

    }
}
class 오리 {
    날개 날개 = new 날개();
    오리발 오리발 = new 오리발();
    void 날다() {
        날개.사용하다();
    }
    void 헤엄치다() {
        오리발.쓰다();
    }
}
class 청둥오리 extends 오리 {
    청둥오리() {
    }
}
class 로켓오리 extends 오리 {
}
class 고무오리 extends 오리 {
}
class 아수라오리 extends 오리 {
}
class 날개 {
    void 사용하다() {
        System.out.println("날개로 날아갑니다");
    }
}
class 로켓날개 extends 날개 {
    void 사용하다() {
        System.out.println("로켓날개로 발사됩니다.");
    }
}
class 고무날개 extends 날개 {
    void 사용하다() {
        System.out.println("고무날개로는 날수없습니다.");
    }
}
class 오리발 {
    void 쓰다() {
        System.out.println("오리발로 헤엄칩니다.");
    }

}
class 로켓오리발 extends 오리발 {
    void 쓰다() {
        System.out.println("로켓오리발로 헤엄칩니다.");
    }
}
class 고무오리발 extends 오리발 {
    void 쓰다() {
        System.out.println("고무오리발로 둥둥떠다닙니다.");
    }
}