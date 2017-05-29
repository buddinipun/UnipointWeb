package com.unipoint.controller;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import com.unipoint.model.Greeting;
import com.unipoint.model.HelloMessage;

public class GreetingController {

	
	 @MessageMapping("/hello")
	    @SendTo("/topic/greetings")
	    public Greeting greeting(HelloMessage message) throws Exception {
	        Thread.sleep(1000); // simulated delay
	        return new Greeting("Hello, " + message.getName() + "!");
}
	 
}
