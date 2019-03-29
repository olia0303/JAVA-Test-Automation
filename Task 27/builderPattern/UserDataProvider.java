package mailRu.helpers.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import mailRu.helpers.builderPattern.UserBuilder;

public class UserDataProvider {

	public static UserBuilder getUserData() throws NumberFormatException, SQLException {
		String url = "jdbc:mysql://localhost:3306/sys?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval = true";
		String login = "root";
		String password = "nokia7380";
		String query = "SELECT * from test_automation.users";
		ResultSet result = getResultSet(url, login, password, query);
		return getUserBuilder(result);
	}

	private static UserBuilder getUserBuilder(ResultSet result) throws SQLException {
		UserBuilder user = new UserBuilder();
		result.next();
		user.setId(Integer.parseInt(result.getString(1)));
		user.setLogin(result.getString(2));
		user.setPassword(result.getString(3));
		return user;
	}

	private static ResultSet getResultSet(String url, String login, String password, String query) throws SQLException {
		ResultSet resultSet = null;
		Connection connection = DriverManager.getConnection(url, login, password);
		Statement statement = connection.createStatement();
		resultSet = statement.executeQuery(query);
		return resultSet;

	}
}
