package user;

public class UserDTO {
	
	private String userID;
	private String userPassword;
	private String userEamil;
	private String userEmailHash;
	private boolean userEmailChecked;
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEamil() {
		return userEamil;
	}
	public void setUserEamil(String userEamil) {
		this.userEamil = userEamil;
	}
	public String getUserEmailHash() {
		return userEmailHash;
	}
	public void setUserEmailHash(String userEmailHash) {
		this.userEmailHash = userEmailHash;
	}
	public boolean isUserEmailChecked() {
		return userEmailChecked;
	}
	public void setUserEmailChecked(boolean userEmailChecked) {
		this.userEmailChecked = userEmailChecked;
	}
	
	public UserDTO() {
	}
	public UserDTO(String userID, String userPassword, String userEamil, String userEmailHash,
			boolean userEmailChecked) {
		this.userID = userID;
		this.userPassword = userPassword;
		this.userEamil = userEamil;
		this.userEmailHash = userEmailHash;
		this.userEmailChecked = userEmailChecked;
	}
	
	
}
