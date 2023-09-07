package day7.AccessModifier.AccessModifierExam2;
// 문제 : 사람의 id를 출력해주세요.
// 조건 : 사람의 id를 20으로 설정해주세요.
// 조건 : 사람 클래스의 id 필드의 private 속성은 수정할 수 없습니다.
// 조건 : 사람 클래스에서 출력할 수 없습니다.
public class AccessModifierExam2 {
    public static void main(String[] args) {
        Person p1 = new Person();

        // 구현시작
        // 구현끝
        p1.setId(20);
        // 출력 : 제 번호는 20 입니다.
        System.out.println(p1.getId());
    }
}
class Person {
    private int id;

    // 힌트 : 여기에 메소드 2개 추가해야 합니다.
    public void setId(int num) {
        this.id = num;
    }
    public int getId() {
        return this.id;
    }

}
