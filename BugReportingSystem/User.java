package BugReportingSystem;

public class User {
	private String name;
	private Integer id;
	public User(String userName, Integer userId) {
		
		this.name = userName;
		this.id = userId;
	}
	public String getUserName() {
		return name;
	}
	public Integer getUserId() {
		return id;
	}
	@Override
	public String toString() {
		return "User [userName=" + name + ", userId=" + id + "]";
	}
	
	
	

}
