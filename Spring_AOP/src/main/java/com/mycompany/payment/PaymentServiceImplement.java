package com.mycompany.payment;

public class PaymentServiceImplement implements PaymentService{

	
	@Override
	public void makePayment() {
		
		System.out.println("Payment Credited!");
		System.out.println("Payment Debited!");
	}
}
