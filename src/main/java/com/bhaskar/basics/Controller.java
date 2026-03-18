package com.bhaskar.basics;

import org.springframework.web.bind.annotation.GetMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import java.util.logging.Logger;

@RestController
@RequestMapping("v1")
public class Controller {

   private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    public int divide(int a , int  b ) throws Exception {
        try{
            int result = a / b;
            return result;
        } catch(Exception e) {
            logger.error("0 nhi beta");
            return 0;
        }
    }
    @GetMapping("/greet")
    public String fn()  throws Exception {
        System.out.println(divide(10,0));
        return "HEY GOOD  AFTERNOON";
    }
}
