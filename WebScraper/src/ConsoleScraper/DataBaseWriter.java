package ConsoleScraper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class DataBaseWriter {

	public void writeToDatabase(Stock share) {
		

		try {
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.1.201/financialscraper",
					"jfdoyle3", "F1ipp3r6467");
			System.out.println("DB open");

			String sql = "INSERT INTO simplestocktable (datestamp, symbol, lastprice) values (?,?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			Timestamp timeStamp = new Timestamp(System.currentTimeMillis());
			statement.setTimestamp(1, timeStamp);
			statement.setString(2, share.symbol);
			statement.setString(3, share.lastprice);
			
			 int row = statement.executeUpdate();
			if (connection != null)
				connection.close();
			System.out.println("Connection closed !!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}