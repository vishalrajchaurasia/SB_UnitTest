package in.vishalit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.vishalit.dao.UserDao;

@Service
public class UserService {
	
	@Autowired //required=false- means there is no implementation class is available
	private UserDao userDao;
	
	public String getUserName(Integer uid) {
		System.out.println(userDao.getClass().getName());
		String findName = userDao.findName(uid);
		System.out.println("Name::"+ findName);
		return findName;
	}
}
