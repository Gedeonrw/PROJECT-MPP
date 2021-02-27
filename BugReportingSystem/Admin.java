package BugReportingSystem;

import java.util.List;

public class Admin extends User{
	
	List<BackLog>  logs;
	public Admin(String userName, Integer userId) {
		super(userName, userId);
		
	}
	
	

}
