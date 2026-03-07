package com.bhaskar.basics;

import org.springframework.stereotype.Component;

@Component
public class RazorPay implements PaymentGateway{

    @Override
    public void pay(){
        System.out.println("RazorPay");
    }

}
