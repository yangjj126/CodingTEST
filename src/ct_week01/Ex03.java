package ct_week01;
/*
 연산자
 */


public class Ex03 {
    static void main() {
    int a = 3, b = 4;
    // 산술연산자
        System.out.println(a + b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b); // 0
        System.out.println(a%b); // 3
        System.out.println("=======================0");
        System.out.println(a++); // a를 먼저 출력하고 1더함
        System.out.println(++a); // 1을 먼저 더하고, a를 출력
        System.out.println(++b);
        System.out.println(b++);
        System.out.println(a > b ? "T" : "F"); //둘이 같기 때문에, F가 출력된다...
    // 논리 + 관계연산자
    // &&, ||, !
        if (a > b){
            System.out.println("T");
        }
        if (a != b) {
            System.out.println("F");
        }
        if (a > 0 && b < 0){
            System.out.println();
        }
        if (a > 0 || b > 0){
            System.out.println();
        }

    // 비트연산자 - 이해해라...
        int i = 1, j = 2;
        System.out.println(i&j);
        System.out.println(i|j);
        System.out.println(i^j);
        //비트 연산자는 무엇일까...

        //비트 시프트
        //비트를 이동시킨다
        System.out.println(i<<1); // i X 2
        System.out.println(i>>1); // i / 2
        System.out.println(i>>>1);
    }
}
