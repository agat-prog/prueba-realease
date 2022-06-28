package prueba;

public class User {
	private String nick;
	private String email;

	public User() {
		super();
	}

	public User(String nick, String email) {
		super();
		this.nick = nick;
		this.email = email;
	}

	public String getNick() {
		return nick;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

}
