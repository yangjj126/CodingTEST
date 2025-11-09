package ct_week01;

/*
조건문 switch
 */

public class Ex05 {
    static void main() {
        int i = 3;

        switch (i) {
            case 1:
                System.out.println("1분기");
                break;
            case 2:
                System.out.println("2분기");
                break;
            case 3:
                System.out.println("3분기");
                break;
            case 4:
                System.out.println("4분기");
                break;
            default:
                System.out.println("잘못된 숫자");
                break;
        }

        // switch를 쓰는 경우는 숫자가 딱 맞아떻러질때..
    }
}
