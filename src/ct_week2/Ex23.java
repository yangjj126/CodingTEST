package ct_week2;

import java.util.ArrayList;
import java.util.List;

/*
 * ArrayList, LinkedList == ArrayList를 하던것처럼 만들고, 그 다음에, LinkedkList로 변환시켜준다
 */
public class Ex23 {
    static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        long startTime, endTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 100; i++){
            list2.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        for (int i = 0; i < 100; i++){
            list1.add(String.valueOf(i));
        }
        System.out.println("ArrayList : " + (endTime - startTime) + "ns");


        startTime = System.nanoTime();
        for (int i = 0; i < 100; i++){
            list2.add(String.valueOf(i));
        }
        for (int i = 100; i < 10000; i++) {
            list2.add(50, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList : " + (endTime - startTime) + "ns");
    }
}
