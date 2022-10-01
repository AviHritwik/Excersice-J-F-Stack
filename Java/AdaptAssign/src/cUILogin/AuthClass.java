package cUILogin;

public class AuthClass {
	private String userId;
	private String password;
	private int failedAttempt;
	public AuthClass(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
		this.failedAttempt=0;
	}
	
	public int login(String userId, String password) {
		this.failedAttempt++;
		if(userId.equals(this.userId) && password.equals(this.password)) {
			this.failedAttempt=0;
		}
		return failedAttempt;
	}
	
	
}
