package com.bhaskar.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BasicsApplication implements CommandLineRunner {

//	@Autowired // loose coupling
//    private greet greet1;


//	private final greet greet1;

	@Autowired
	private PaymentGateway paymentGateway;

	//tight coupling with constructor dependency injection
	// its more practised beacuse we can make it tightly coupled and final reference variable allows us to
	// keep things intact and less messy and more professional
//    public BasicsApplication(greet greet1) {
//        this.greet1 = greet1;
//    }

    public static void main(String[] args) {
		ApplicationContext context =
				SpringApplication.run(BasicsApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
//		greet1.Greet();
		paymentGateway.pay();
	}
}