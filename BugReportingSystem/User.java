package BugReportingSystem;

public class User {
	private String userName;
	private Integer userId;
	public User(String userName, Integer userId) {
		
		this.userName = userName;
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public Integer getUserId() {
		return userId;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userId=" + userId + "]";
	}
	
	
	

}
