package day7.AccessModifier.AccessModifierExam1;

public class AccessModifierExam1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setId(20);

        System.out.println("제 번호는 " + p1.getId() + " 입니다.");
        // 출력 : 제 번호는 20 입니다.
    }
}
class Person {
    // private => 외부로 공개되지 않는다., 리모콘에 노출되지 않는다.
    private int id;
    public void setId(int num) {
        id = num;
    }
    public int getId() {
        return this.id;
    }
}
