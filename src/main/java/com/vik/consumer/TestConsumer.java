package com.vik.consumer;

import com.vik.dto.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class TestConsumer {

    /*@Bean
    public Consumer<Message<Person>> consumeEvent(){
        return strMsg -> {
           final Person req = strMsg.getPayload();
           System.out.println(" MSG RECEIVED : "+ req);
        };
    }*/

    @Bean
    public Consumer<Message<Customer>> consumeEvent(){
        return strMsg -> {
            final Customer req = strMsg.getPayload();
            System.out.println(" MSG RECEIVED : "+ req);
        };
    }


}
