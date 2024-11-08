package javaweb.model.dto;


// 使用者憑證(內容)，登入後會取得的資料(只有 getter )。
// 憑證簽發完後必須是唯獨


public class UserCert {
	private Integer userId; // 使用者ID
	private String username; // 使用者名稱
	private String role; // 角色權限
	// private Date loginTime; //日期時間，etc.自行增加憑證內的資訊
	
	
	public UserCert(Integer userId, String username, String role) {
		this.userId = userId;
		this.username = username;
		this.role = role;
	}

	public Integer getUserId() {
		return userId;
	}

	public String getUsername() {
		return username;
	}

	public String getRole() {
		return role;
	}

	@Override
	public String toString() {
		return "UserCert [userId=" + userId + ", username=" + username + ", role=" + role + "]";
	}

	
	

	
	
}
