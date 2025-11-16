package ct_week2;
/*
** 추상클래스를 이용한 extends
*
 */

abstract class Phone{ // 추상 클래스임 ㅅㄱ
    private String number = "010-1234-5678";

    public abstract void call();
    // 추상 메서드 == 디른 클래스가 실행하도록 만든다

    public String getNumber(){
        return number;
    }
}



class PublicPhone extends Phone{ //앞에 아무것도 없음 default class

    @Override
    public void call() {
        System.out.println(this.getName() + "에서" +
                this.getNumber() + "로 전화를 걸겁니다");
        // getNumber메서드가 해당 클래스에 없으면, 부모클래스의 getNumber을 사용한다
    }

    public String getName(){
        return "공중전화";
    }
}






class SmartPhone extends Phone{

    @Override
    public void call() {
        System.out.println(this.getName() + "에서" +
                this.getNumber() + "로 전화를 걸겁니다");
        // getNumber메서드가 해당 클래스에 없으면, 부모클래스의 getNumber을 사용한다
    }

    public String getName(){
        return "스마트폰";
    }
}






public class CallPhone {
    public static void main(String[] args) {
         Phone p1 = new PublicPhone();
         Phone p2 = new SmartPhone();
         p1.call();
         p2.call();

         System.out.println();

         Phone p3 = p1;
         Phone p4 = p2;
         p3.call();
         p4.call();
    }

    // 상위 타입(Phone)의 참조 변수가
    // 하위 타입(PublicPhone, SmartPhone)의 객체를 참조할 수 있는 것이
    // 다형성이에요.
    // ---------------------------------------------------------
    // 이걸 "업캐스팅(Upcasting)"

    // 컴파일 시점에는 p1과 p2가 Phone 타입이니까 Phone의 call()을 호출할 거라고 생각하지만...
    // 런타임(실행되는 순간)에 실제로 p1이 PublicPhone 객체를 참조하고 있다는 것을 파악하고,
    // PublicPhone 클래스에 오버라이딩된 call() 메서드를 실행합니다.
    // p2도 마찬가지로 SmartPhone의 call()을 실행하죠.
    // 이것을 "동적 메서드 디스패치(Dynamic Method Dispatch)"라고 부르며,
    // 다형성의 핵심 동작 원리예요. 같은 call()이라는 이름으로 호출해도, 어떤 객체가 들어있느냐에 따라 다른 결과가 나오는 거죠!
}
