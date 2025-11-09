package ct_week01;

/*
반복문 --- for
 */


public class Ex06 {
    static void main() {
        // 구구단 세로형...
      /*
      2 x 1 = 2
      2 x 2 = 4
      .
      .
      .
      .
      9 x 9 = 81
      */
//    for (int i=2;i <= 9; i++) //i는 for문안에서 실행이 된 이후에, 올라간다
//        for (int j = 1; j <= 9; j++){
//            System.out.printf("%d X %S = %d\n",i,j,i*j); // \n은 줄바꿈..
//        }
//        System.out.println("---------------------------");
//    }

        // 구구단 가로형...
      /*
      2 x 1 = 2, 3 x 1 = 3
      */

        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%d X %d = %-2d", j, i, i * j);
            }
            System.out.println();
        }
    }
}
