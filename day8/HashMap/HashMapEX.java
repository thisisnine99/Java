package day8.HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapEX {
    public static void main(String[] args) {


        //  ArrayList

        ArrayList<String> list = new ArrayList<>();

        //  배열은 같은 자료형만 묶을 수 있었다.
        //  데이터 접근은 숫자 인덱싱
        list.add("홍길동");
        list.add("20");
        list.add("대전");
        //  어디에 뭐가 있는지 모른다 -> 그래서 클래스/객체 사용
        //  해시맵 -> 데이터를 키바인딩하여 저장

        HashMap map = new HashMap();
        //  저장 -> put(key, value)
        //  조회 -> get(key)
        //  수정 -> put(key, value)
        //  삭제 -> remove(key)

        //  저장
        map.put(0, "홍길동");
        map.put("이름", "홍길동");
        map.put(true, "참");
        map.put("사과", new 사과());

        //  조회
        System.out.println(map.get(0));
        System.out.println(map.get("이름"));
        System.out.println(map.get(true));
        System.out.println(map.get("사과"));


        //  제너릭을 사용한 버전
        HashMap<String, String> myMap = new HashMap<>();
        //  key와 value값을 String으로 고정.

        HashMap<String, Object> myMap2 = new HashMap<>();
        myMap2.put("이름", "홍길동");
        myMap2.put("나이", 20);
        myMap2.put("거주지", "대전");

        String name = (String)myMap2.get("이름");
        System.out.println(name);
        //  HashMap의 대부분은 클래스, 객체로 대체 가능

        //  사용하기 편리함.
        //  탐색 속도 빠르다.
        //  데이터의 구조가 상대적으로 명확(직관적)

        //  put -> 수정으로도 사용됨
        //  put -> 키가 존재하면 수정, 존재하지 않으면 저장.

        //  remove
        myMap2.remove("거주지");
        System.out.println(myMap2.get("거주지"));  //  없는키를 가지고 출력하면 null이 나온다.

    }
}

class 사과 {

}