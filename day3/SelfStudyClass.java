package day3;

public class SelfStudyClass {
    public static void main(String[] args) {

        Animal cat = new Animal();
        cat.setName("사향고양이");
        System.out.println("고양이의 이름은 : " + cat.name);

        Animal dog = new Animal();
        dog.setName("골든리트리버");
        System.out.println("강아지의 이름은 : " + dog.name);
    }

}

class Animal {
    String name;
    public void setName(String a) {
        this.name = a;

    }
}
