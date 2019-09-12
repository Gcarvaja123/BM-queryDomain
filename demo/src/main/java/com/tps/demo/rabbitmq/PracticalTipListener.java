package com.tps.demo.rabbitmq;

import java.io.IOException;
import java.security.GeneralSecurityException;

import com.tps.demo.DemoApplication;
import com.tps.demo.resources.BookInfoResource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class PracticalTipListener {

    @RabbitListener(queues = DemoApplication.DEFAULT_PARSING_QUEUE)
    public void consumeDefaultMessage(final Message message) {
        System.out.println(message.getPayload());
        BookInfoResource query = new BookInfoResource();
        try {
            System.out.println(query.volumenQuery((String) message.getPayload()));
        } catch (NullPointerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (GeneralSecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
