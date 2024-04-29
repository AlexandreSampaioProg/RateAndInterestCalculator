package services;

public interface PaymentBase {
	double paymentFee(double amount);
	double interest(double amount, int months);
}
