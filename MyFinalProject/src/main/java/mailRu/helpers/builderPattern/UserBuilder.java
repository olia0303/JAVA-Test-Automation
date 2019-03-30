package mailRu.helpers.builderPattern;

public class UserBuilder {
	private int id;
	private String login;
	private String password;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public static class Builder {
		private UserBuilder newUserBuilder;
		
		public Builder() {
			newUserBuilder = new UserBuilder();
		}

		public Builder withLogin(String login) {
			newUserBuilder.login = login;
			return this;
		}

		public Builder withPassword(String password) {
			newUserBuilder.password = password;
			return this;
		}

		public Builder withId(int id) {
			newUserBuilder.id = id;
			return this;
		}

		public Builder withName(String name) {
			newUserBuilder.name = name;
			return this;
		}

		public UserBuilder build() {
			return newUserBuilder;
		}

	}
}