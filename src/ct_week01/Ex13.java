package ct_week01;

import java.util.*;
// 자료형(대문자)인것들은 다 import해줘야한다
// java.util.* == 전부다 들고 오세요...

/*
 배열정렬
 */

public class Ex13 {
    static void main() {
        int[] arr = new int[] {10,4,2,7,6,1,8};
        int[] arr2 = new int[] {10,4,2,7,6,1,8};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr2, 3,6);
        System.out.println(Arrays.toString(arr2));
    }
}


//
//class Solution {
//    public String solution(String my_string) {
//        String answer = "";
//        for (int i = my_string.length() - 1; i >= 0; i--){
//            answer = my_string.charAt(i);\
// answer = answer + my_string.charAt(i);
// 어차피 문자열 + 캐릭터 == 문자열이 된다             //            /*
//             자료형 -> String : String.valueOf(값)
//             String -> 자료형 : Integer.parseInt(), Double.parseDouble();
//            */
//        }
//        return answer;
//    }
//}