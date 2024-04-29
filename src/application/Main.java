
package application;

import entities.Installment;
import entities.Payment;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import services.ContractService;
import services.PaypalPayment;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		String numberPayment = sc.nextLine();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		Double totalValue = sc.nextDouble();
                
                Payment obj = new Payment(numberPayment, date, totalValue);
		
		System.out.print("Entre com o numero de parcelas: ");
		int n = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalPayment());
		
		contractService.processContract(obj, n);
		
		System.out.println("Parcelas:");
		for (Installment installment : obj.getInstallments()) {
			System.out.println(installment);
		}
		
		sc.close();
                
    }
}
