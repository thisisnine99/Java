package day7.superExam;

public class Test {
    public static void main(String[] args) {
        Bus b = new Bus();
    }
}

class Car {
    Car(String name) {
        System.out.println("Car");
    }
}

class Bus extends Car {
//    Bus() {}
    Bus() {
        super("aa");
    }
}