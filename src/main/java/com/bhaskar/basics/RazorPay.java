package com.bhaskar.basics;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "payment.provider" , havingValue = "RazorPay" )
public class RazorPay implements PaymentGateway{

    @Override
    public void pay(){
        System.out.println("RazorPay");
    }

}
