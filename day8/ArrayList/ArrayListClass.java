package day8.ArrayList;
import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {

        Integer[] iarr = new Integer[10];   //  왜 배열 안쓰고??
        //  정답 : 배열이 불편해서
        //  길이가 정해져있다. (부족하거나 남는일 발생)
//        iarr[10] = 20;

        //  배열 삭제, 추가 -> 귀찮다.
        int[] arr = {1,2,3,4,5};
        for(int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
        //  1,2,3,4,5
        //  1,2,4,5
        //  삭제,추가 개념이없어서 직접 구현해야함
        //  삭제하고자하는 부분을 맨뒤로 넘기고 그걸 사용하지않는다.

        //  몇개 저장했는지 알기 힘듦.
        int[] arr2 = new int[10];
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;

        //  저장소가 꽉 차면 알아서 늘어나고,
        //  추가, 삭제도 가능하고,
        //  몇개 저장했는지 알수도있는

        //  자바가 제공하는 저장소 클래스 -> ArrayList
        ArrayList<Integer> a저장소 = new ArrayList<>();

        //  추가 - add()
        //  조회 - get()
        //  수정 - set()
        //  삭제 - remove()
        //  사이즈 - size()

        //  추가 - add()
        a저장소.add(10);
        a저장소.add(20);
        a저장소.add(30);

        //  조회 - get()
        int num = a저장소.get(1);
        System.out.println(num);
        num = a저장소.get(0);
        System.out.println(num);

        //  수정 - set()
        a저장소.set(1, 10);
        num = a저장소.get(1);
        System.out.println(num);

        //  삭제 - remove()
        //  현재값 10,10,30
        a저장소.remove(1);
        num = a저장소.get(1);
        System.out.println(num);

        //  사이즈 - size()
        int size = a저장소.size();
        System.out.println(size);
    }
}
