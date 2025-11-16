package ct_week2.payment;

public class PaypalPayment implements Payment{
    @Override
    public void pay(int amount) {
    System.out.println(amount + "을(를) 페이팔카드로 결제하였습니다.");
    }
}
