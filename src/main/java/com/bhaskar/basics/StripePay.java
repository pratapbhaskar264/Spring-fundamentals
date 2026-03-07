package com.bhaskar.basics;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "payment.provider" , havingValue = "StripePay" )
public class StripePay implements PaymentGateway{
    @Override
    public void pay() {
        System.out.println("StripePay");
    }
}
