package in.vishalit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Override
	public String findName(Integer uid) {
		
		return "john"; 
	}
}
