package ct_week01;
/*
break, continue문이다....
 */


public class Ex08 {
    static void main() {
        // break
        for (int i = 0; i < 100; i++){
            if (i == 50) break; // for문을 빠져나가겠다..
            System.out.println(i);
        }

        // continue
        for (int i = 0; i <100; i++){
            if (i % 2 == 0) continue; //continue는 조건이 맞으면, 아래코드를 실행하지 않고, for문으로 다시 간다
            System.out.println(i);
        }
    }
}
