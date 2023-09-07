package day6.exam.examDuck;

public class ExamDuck {
    public static void main(String[] args) {

        청둥오리 a청둥오리 = new 청둥오리();
        System.out.println("======청둥오리======");
        a청둥오리.날다();
        a청둥오리.헤엄치다();
        // 출력 : 오리가 날개로 날아갑니다.

        흰오리 a흰오리 = new 흰오리();
        System.out.println("======흰오리======");
        a흰오리.날다();
        a흰오리.헤엄치다();
        // 출력 : 오리가 날개로 날아갑니다.

        고무오리 a고무오리 = new 고무오리();
        System.out.println("======고무오리======");
        a고무오리.날다();
        a고무오리.헤엄치다();
        //출력 : 오리가 날개로 날아갑니다.


        // 상속만으로 코드 중복을 완전히 해소할 수 없었다.
        // 코드 중복을 해소하기 위해서 상속을 사용하는 건 본질 X
        // 계층 구조를 표현 가능

        아수라오리 a아수라오리 = new 아수라오리();
        System.out.println("======아수라오리======");
        a아수라오리.날다();
        a아수라오리.헤엄치다();
    }
}

class 오리 {
    날개 날개 = new 오리날개();
    발 발 = new 오리발();

    void 날다() {
        날개.사용하다();
    }

    void 헤엄치다() {
        발.수영하다();
    }
}

class 청둥오리 extends 오리 {
    청둥오리() {
        this.날개 = new 불사조날개();
        this.발 = new 불사조오리발();
    }
}

class 흰오리 extends 오리 {
}

class 고무오리 extends 오리 {
    고무오리() {
        this.날개 = new 고무오리날개();
        this.발 = new 고무오리발();
    }
}

class 아수라오리 extends 오리 {
    아수라오리() {
        this.날개 = new 로켓날개();
        this.발 = new 고무오리발();
    }
}

class 날개 {
    void 사용하다() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
}

class 오리날개 extends 날개 {
}
class 로켓날개 extends 날개 {
    void 사용하다() {
        System.out.println("오리가 로켓날개로 날아갑니다.");
    }
}

class 고무오리날개 extends 날개 {
    void 사용하다() {
        System.out.println("날수없어요");
    }
}

class 불사조날개 extends 날개 {
    void 사용하다() {
        System.out.println("불사조날개로 날아갑니다");
    }
}

class 발 {
    void 수영하다() {
        System.out.println("오리가 오리발로 헤엄칩니다");
    }
}

class 오리발 extends 발 {
}

class 고무오리발 extends 발 {
    void 수영하다() {
        System.out.println("오리가 오리가 물에 둥둥 떠갑니다");
    }
}

class 불사조오리발 extends 발 {
    void 수영하다() {
        System.out.println("불사조오리발이 물에 빠졌습니다");
    }
}