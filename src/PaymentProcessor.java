public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;  // Strategy interface

    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Set the payment strategy dynamically
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Perform the payment
    public void processPayment(double amount) {
        paymentStrategy.pay(amount);
    }
}
