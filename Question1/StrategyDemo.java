interface PaymentStrategy {
    void pay(int amount);
}
class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
class PayPalPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}
class PaymentContext {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void payAmount(int amount) {
        if (strategy != null) {
            strategy.pay(amount);
        } else {
            System.out.println("No payment method selected!");
        }
    }
}
public class StrategyDemo {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        context.setPaymentStrategy(new CreditCardPayment());
        context.payAmount(1000);
        context.setPaymentStrategy(new PayPalPayment());
        context.payAmount(500);
    }
}
