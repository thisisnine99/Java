package day5.casting;

public class ObjectCastingExam1 {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        String 이름 = "홍길동";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();
        // 안녕하세요 저는 20살 홍길동입니다.

        a전사.a무기 = new 활();
        a전사.공격();
        // 출력 : 홍길동이/가 활로 공격합니다.

        a전사.a무기 = new 칼();
        a전사.공격();
        // 출력 : 홍길동이/가 칼로 공격합니다.
    }
}

class 전사 {

    String 이름;
    int 나이;
    무기 a무기 = new 무기();

    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + 나이 + "살 " + 이름 + " 입니다.");
    }

    void 공격() {
        String name = this.이름;
        a무기.공격(name);
    }
}

class 무기 {
    void 공격(String name) {
    }
}

class 활 extends 무기 {
    void 공격(String name) {
        System.out.printf("%s 이/가 활로 공격합니다.\n", name);
    }
}

class 칼 extends 무기 {
    public void 공격(String name) {
        System.out.printf("%s 이/가 칼로 공격합니다.\n", name);
    }
}