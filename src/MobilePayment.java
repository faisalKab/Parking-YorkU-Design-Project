public class MobilePayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Mobile Payment.");
    }
}

