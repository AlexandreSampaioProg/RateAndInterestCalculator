package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Payment {

    private String numberPayment;
    private LocalDate date;
    private Double totalValue;
    
    private List<Installment> installments = new ArrayList<>();

    public Payment(String numberPayment, LocalDate date, Double totalValue) {
        this.numberPayment = numberPayment;
        this.date = date;
        this.totalValue = totalValue;
    }

    public String getNumberPayment() {
        return numberPayment;
    }

    public void setNumberPayment(String numberPayment) {
        this.numberPayment = numberPayment;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }    
}
