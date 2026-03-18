package com.bhaskar.basics;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Component
public class greet {


    public void Greet(){
        System.out.println("Good afternoon boii");
    }

}
