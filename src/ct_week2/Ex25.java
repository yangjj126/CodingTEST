package ct_week2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex25 {
    static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("홍기롣", 70);
        map.put("홍기r", 80);
        map.put("홍기m", 90);
        map.put("홍기c", 100);
        // key만 봤을때는 , 중복이 안되기때문에, set과 같다
        System.out.println(map.toString());
        System.out.println(map.size());
        System.out.println(map.get("홍기m")); // get의 key값을 들고 와야한다
        System.out.println(map.getOrDefault("홍길맘", 890));
        // key가 없을 경우에는, 0으로 한다 예를들어, 학교에서 총점구할때, 안낸놈은 0점

        Set<String> keySet = map.keySet();
        // keySet() 메서드는 이 Map 안에 있는 모든 key들만 모아서 Set 형태로 반환
        for (String s : keySet){
            System.out.println(s + "=" + map.get(s)); // key만 출력된다
        }
        // map.get(s)는 말씀하신 대로 map에서 key(s)에 해당하는 value를 얻는 역할을 해요.
        // s는 바로 Map의 key 값을 의미한답니다!
        map.remove("홍길맘");
        System.out.println(map.toString());

    }
}
