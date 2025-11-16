package ct_week2.payment;

public class CreditPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println(amount + "을(를) 신용카드로 결제하였습니다.");
    }
}
