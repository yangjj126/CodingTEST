package ct_week01;

/*
문자열(string)
 */

public class Ex10 {
    static void main() {
         String s = "GoodMorning";
         String s1 = "ABCDabcd123";

        System.out.println("charAt :" + s.charAt(5));
        System.out.println("startsWith :" + s.startsWith("good"));
        System.out.println("endsWith :" + s.endsWith("ng!"));
        System.out.println("equals :" + s.equals("good Morning!"));
        System.out.println("indexOf" + s.indexOf("n")); //n이 몇번째 자리에 있는가...
        System.out.println("lastIndexOf" + s.lastIndexOf("n")); //마지막 번째 n이 몇번째 자리에 있는가...
        System.out.println("length :" + s.length());

        System.out.println("replace :"+ s.replace("Good", "good"));
        System.out.println("replace :"+ s.replace('o','a'));;
        System.out.println("replaceFirst :" + s.replaceFirst("o","a"));

        System.out.println("replaceAll :" + s.replaceAll("Good","good"));
        System.out.println("replaceAll :" + s.replaceAll("o","a"));
        System.out.println("replaceAll :" + s.replaceAll("[Good]","a"));
        //대괄호가 있을때는, 안의 문자하나하나를 다보고, 각각을 다바꿔준다
        System.out.println("replaceAll :" + s1.replaceAll("[0-9]",""));
        // 0부터 9까지의 숫자를 없에준다
        System.out.println("replaceAll :" + s1.replaceAll("[^0-9]",""));
        // 0에서 9를 빼고, 다 제거해준다 - 꺽쇠를 대괄호안에 쓰면 NOT
        System.out.println("replaceAll :" + s1.replaceAll("^[AB]",""));
        // A로 시작하거나 B로 시작할때, 그 처음 문자를 삭제해준다
        System.out.println("replaceAll :" + s1.replaceAll("[0-9]$",""));
        // 끝이 0에서 9중에 하나 있으면, 그 문자를 없에 주겠다..
        // 결국 문자열 바깥에 써주면은, 맨앞또는 맨뒤의 문자를 없엔다

        // 이런 코드들은 코드의 효율성을 중요시하게한다..
    }
}
