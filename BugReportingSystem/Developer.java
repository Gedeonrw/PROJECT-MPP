package BugReportingSystem;

import java.util.List;

public class Developer extends User{

	List<Type> type;
	private Project projet;
	private BackLog backLog;
	
	
	public Developer(String name, Integer id) {
		super(name, id);
		
	}

	
}
