package ct_week01;

/*
break label
 */

public class Ex09 {
    static void main() {
      bl:while (true) {
            for (int i = 0; i < 100; i++){
                if ( i == 50 )  break bl; // i=50 -> while -> 다시 for문으로 들어와서, 1부터 49까지 출력이 무한 반복된다
                System.out.println(i);
            }
        }
    }
}
