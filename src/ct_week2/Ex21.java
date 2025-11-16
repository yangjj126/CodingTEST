package ct_week2;
/*
리스트 ( Array List )
 */

import java.util.ArrayList;
import java.util.List;

public class Ex21 {
    static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // 좌변에 <>안에 String을 써주면, <>안에 String을 써줄 필요 없다

        // 1. list.add() == 배열에 요소 추가하기
        list.add("Java");
        list.add("Spring");
        list.add("Mybatis");
        System.out.println(list.toString());
        // Arrays.toString()과의 차이점은 과연 무엇인가

        // 2. list.add(index, elememt) == 배열의 몇번째 요소에 element추가
        list.add(2,"Oracle");
        System.out.println(list.toString());

        // 3. list.set("요소인덱스", "element") == 해당인덱스의 요소를 바꾸기
        list.set(3,"MySQL");
        System.out.println(list.toString());

        // 4. list.remove의 경우에는, 해당 인덱스의 요소를 삭제한다 또는 해당 요소를 직접적으로 삭제한다
        list.remove(0);
        list.remove("Mybatios");
        System.out.println(list.toString());

        // 5. list.isEmpty() == 과연, list내부가 비어있나 아님 차있나
        System.out.println(list.isEmpty());
    }
}
