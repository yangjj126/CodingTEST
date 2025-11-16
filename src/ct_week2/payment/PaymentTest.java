package ct_week2.payment;

public class PaymentTest {
    static void main(String[] args) {
        PaymentProcess process = new PaymentProcess();

        Payment p1 = new CreditPayment();
        Payment p2 = new PaypalPayment();
        process.process(p1,100);
        process.process(p2,200);
    }
}