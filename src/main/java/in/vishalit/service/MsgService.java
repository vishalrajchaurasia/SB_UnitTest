package in.vishalit.service;

import org.springframework.stereotype.Service;

@Service 
public class MsgService {
	
	public String getWelcomeMsg() {
		String msg= "Welcome to vishal IT";
		return msg ;
	}
	
	public String getGreetMsg() {
		String msg= "Good Evening";
		return msg ;
	}
}
