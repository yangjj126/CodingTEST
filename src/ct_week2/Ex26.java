package ct_week2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Map을 이용한 로그인 로직
1. 입력한 아이디가 존재하는지 검사
2. 존재하면, 비밀번호 확인 ( 로그인 성공 / 로그인 실패 )
3. 존재하지 않으면, 아이디가 없다고 표시
 */

public class Ex26 {
    static void main(String[] args) {
        Map<String , String> map = new HashMap<>();
        map.put("spring", "1234");
        map.put("summer", "1234");
        map.put("winter", "1234");
        map.put("kaloa", "1234");

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("아이디와 비밀번호 입력");
            System.out.println("아이디 : ");
            String id = scan.nextLine();
            // 1. 아이디 존재여부
            if (map.containsKey(id)) { //  만약 map안에 id와 동일한 key가 존재하는 경우
                System.out.println("비밀번호 : ");
                String pswd = scan.nextLine();
                if (map.get(id).equals(pswd)){ // map의 아이디(key)에 해당하는 비번과 -- pswd(내가 입력한것)이 일치하는 경우
                    System.out.println("로그인 성공");
                    break;
                } else
                {
                    System.out.println("로그인 실패"); // 내가 입력한것과 기존 비번 일치안하는 경우
                }
            }

            else {
                System.out.println("아이디가 존재하지 않습니다");
            }
        }
    }
}
