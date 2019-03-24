package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDatabase {

	public static User getUserData() throws NumberFormatException, SQLException {
		String url = "jdbc:mysql://localhost:3306/sys?useSSL=false&serverTimezone=UTC";
		String login = "root";
		String password = "nokia7380";
		String query = "SELECT * from test_automation.users";
		ResultSet result = getResultSet(url, login, password, query);
		return getUser(result);
	}

	private static User getUser(ResultSet result) throws SQLException {
		User user = new User();
		result.next();
		user.setId(Integer.parseInt(result.getString(1)));
		user.setLogin(result.getString(2));
		user.setPassword(result.getString(3));
		user.setAdress1(result.getString(4));
		user.setAdress2(result.getString(5));
		user.setSubject(result.getString(6));
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
