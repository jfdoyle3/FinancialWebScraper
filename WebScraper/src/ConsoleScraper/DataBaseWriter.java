package ConsoleScraper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseWriter {

	public void writeToDatabase() {

		try {
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.1.201/financialscraper",
					"jfdoyle3", "zyxwvu1");
			System.out.println("DB open");

			String sql = "INSERT INTO simplestocktable (symbol, price) values (?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, "TXI");
			statement.setString(2, "1234.56");
			
			 int row = statement.executeUpdate();
			if (connection != null)
				connection.close();
			System.out.println("Connection closed !!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}