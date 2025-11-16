package ct_week2;

import java.util.HashSet;
import java.util.Set;

/*
* Set
 */
public class Ex24 {
    static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("String");
        set.add("Mybatis");
        set.add("Oralce");
        set.add("Java"); // 이미 나와서 안나옴
        System.out.println(set.toString());

        for (String s : set){
            System.out.println(s);
        }

        set.remove("Oracle");
        // 이거는 인덱스번호로 삭제할 수 없다
        System.out.println(set.toString());
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Java"));
    }
}