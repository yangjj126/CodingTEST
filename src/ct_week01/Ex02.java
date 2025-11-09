package ct_week01;

public class  Ex02 {
    public static void main(String[] args) {
        // 정수
        byte b = 0; //1byte
        char c1 = 'A', c2 = 65; // 2byte ( 0 ~ 65535 )
        char c3 = '0', c4 = 48;
        short s = 100; // 2byte
        int i = 65; // 4byte
        long l = 1000000; // 8byte

        // 실수
        float f = 3.14F; // 4byte = F를 무조건 붙여줘야한다
        double d = 3.141592; // 8byte;  주로 double로 많이 쓴다

        // 논리
        boolean t = false; // 1bit(1byte) while(1)이면, 항상 참일때..

    }
}
