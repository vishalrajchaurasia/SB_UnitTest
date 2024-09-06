package in.vishalit.rest;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import in.vishalit.service.MsgService;

@WebMvcTest(controllers = MsgRestController.class)//it is used to represent what is our target class or which mvc class u want to test
public class MsgRestControllerTest {
	
	@MockBean
	private MsgService service;//my restController is dependent of this mockService.//message service is injected as a mock object
	
	@Autowired
	public MockMvc mockMvc;//to send Https request for mockMvc
	
	@Test
	public void testGreetMsg() throws Exception {
		
		//define mock obj behavior
		when(service.getGreetMsg()).thenReturn("Dumy Msg..");
		
		MockHttpServletRequestBuilder req = 
				MockMvcRequestBuilders.get("/greet");
		MvcResult result = mockMvc.perform(req).andReturn();
		MockHttpServletResponse response = result.getResponse();
		String contentAsString = response.getContentAsString();
		System.out.println(contentAsString);
		
		int status = response.getStatus();
		
		assertEquals(200, status);
		                      
		
	}
	
	@Test
	public void testWelcomeMsg() throws Exception {
		
		//define mock obj behavior
		when(service.getWelcomeMsg()).thenReturn("Good Evening..");
		
		MockHttpServletRequestBuilder req = 
				MockMvcRequestBuilders.get("/welcome");//we are creating a get request /welcome
		
		MvcResult result = mockMvc.perform(req).andReturn();//we are sending a request //what class you have using mockMvc//if you sending the request then return the response
		
		MockHttpServletResponse response = result.getResponse();
		
		String contentAsString = response.getContentAsString();//getContentAsString i am not getting a real response from rest api,this response is coming form mock service method
		
		System.out.println(contentAsString);
		
		int status = response.getStatus();
		
		assertEquals(200, status);
		                      
		
	}
}
