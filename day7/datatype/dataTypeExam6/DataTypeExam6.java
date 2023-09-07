package day7.datatype.dataTypeExam6;

// 3개의 자료형을 저장하기 위해 3개의 class를 만들었습니다. 그러나 저장소의 기능이 다 동일하므로 하나의 class만 만들어 3 자료형을 모두 저장하고 싶습니다. 가능하게 구현해주세요.
public class DataTypeExam6 {
    public static void main(String[] args) {
        저장소 a저장소1 = new 저장소();
        a저장소1.setData(30);
        int a = (int) a저장소1.getData();   //  상위타입이 하위타입으로
        System.out.println(a);


        a저장소1.setData(5.5);
        double b = (double) a저장소1.getData();
        System.out.println(b);

        a저장소1.setData(new 사과());
        사과 c = (사과) a저장소1.getData();
        System.out.println(c);

    }
}

class 저장소 {
    private Object data;

    void setData(Object inputedData) {
        this.data = inputedData;
    }

    Object getData() {
        return (Object) data;
    }
}
class 사과 {

}