package in.vishalit.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import in.vishalit.dao.UserDao;

@SpringBootTest //it is act as a test class
@ExtendWith(value = {MockitoExtension.class})//mock object is created but mock object is not going to target class  
public class UserServiceTest {
	
	@MockBean
	private UserDao userDao;
	
	@InjectMocks // that is my target 
	private UserService userService;
	
	@Test
	public void testGetUsername() {
		
		when(userDao.findName(101)).thenReturn("vishal");
		
		String userName = userService.getUserName(101);
		assertNotNull(userName);
	}
	
	
	
}
