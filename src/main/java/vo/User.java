package vo;

public class User {
	private String id;
	private String password;
	private int birth;
	private String gender;
	private String nickname;
	private String avatarId;
	
	private Avatar avatar;
	
	


	public User() {
		super();
	}

	public User(String id, String password, int birth, String gender, String nickname, String avatarId) {
		super();
		this.id = id;
		this.password = password;
		this.birth = birth;
		this.gender = gender;
		this.nickname = nickname;
		this.avatarId = avatarId;
	}

	public User(String id, String password, int birth, String gender, String nickname, String avatarId, Avatar avatar) {
		super();
		this.id = id;
		this.password = password;
		this.birth = birth;
		this.gender = gender;
		this.nickname = nickname;
		this.avatarId = avatarId;
		this.avatar = avatar;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getAvatarId() {
		return avatarId;
	}

	public void setAvatarId(String avatarId) {
		this.avatarId = avatarId;
	}
	
	public Avatar getAvatar() {
		return avatar;
	}
	
	public void setAvatar(Avatar avatar) {
		this.avatar = avatar;
	}
}


