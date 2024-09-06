package in.vishalit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.vishalit.service.MsgService;
@RestController
public class MsgRestController {
	
	@Autowired
	private MsgService service;
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		
		System.out.println(service.getClass().getName());//what is the proof//variable is holding which class of object we can printed by using getclass.getname method
		
		String welcomeMsg = service.getWelcomeMsg();
		
		welcomeMsg = welcomeMsg.toUpperCase();
		
		return welcomeMsg;
	}
	@GetMapping("/greet")
	public String greetMsg() {
		
		System.out.println(service.getClass().getName());
		
		String greetMsg = service.getGreetMsg();
		
		greetMsg = greetMsg.toUpperCase();
		
		return greetMsg;
	}
}
