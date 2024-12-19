package com.mycompany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.payment.PaymentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome--" );
        
        ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
        PaymentService ps = ac.getBean("payment", PaymentService.class);
        		
        ps.makePayment();
    }
}
