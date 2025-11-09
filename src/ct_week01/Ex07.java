package ct_week01;

/*
   반복문은  while, do-while
*/

public class Ex07 {
    static void main() {
        int i = 1, j = 1;
        // i가 9가 될때까지, i를 1부터 9까지 출력해라
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        do {
            System.out.println(j++);
        } while (j > 5);
        // 실행을 먼저 해놓고, while을 통해서 그 조건이 맞는지 안 맞는지 본뒤에, 실행한다


    }
}
