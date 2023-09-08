package day8.ExceptionExam;

public class ExceptionExam1 {
    public static void main(String[] args) {
        try {
            Person p1 = null;
            p1.hi();
        } catch (NullPointerException e) {
            System.out.println("객체 초기화가 안되었다.");
        }
    }
}
class Person {
    public void hi() {
        System.out.println("안녕");
    }
}