package services;

import entities.Installment;
import entities.Payment;
import java.time.LocalDate;


public class ContractService {
    
    private PaymentBase PaymentBase;

    public ContractService(PaymentBase PaymentBase) {
        this.PaymentBase = PaymentBase;
    }
    
    public void processContract(Payment payment, int months){
        double monthPayment = payment.getTotalValue() / months;
        for (int i = 0; i < months; i++) {
            LocalDate dueDate = payment.getDate().plusMonths(i);
            double interest = PaymentBase.interest(monthPayment, i);
            double fee = PaymentBase.paymentFee(monthPayment + interest);
            double total = monthPayment + interest + fee;
            payment.getInstallments().add(new Installment(dueDate, total));
        }
    }
    
}
