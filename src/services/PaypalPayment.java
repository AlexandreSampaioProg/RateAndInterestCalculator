package services;

public class PaypalPayment implements PaymentBase{
    
    private static final double BASE_PERCENTAGE = 0.02;
    private static final double MONTH_PERCENTAGE = 0.01;       

    @Override
    public double paymentFee(double amount) {
       return amount * BASE_PERCENTAGE;
    }

    @Override
    public double interest(double amount, int months) {
       return amount * MONTH_PERCENTAGE * months;
    }
    
}
