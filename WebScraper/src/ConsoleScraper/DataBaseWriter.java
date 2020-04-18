package ConsoleScraper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

public class DataBaseWriter {

	public void writeToDatabase(ArrayList<Stock> stockList) {

		try {

			Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.1.201/financialscraper",
					"jfdoyle3", "F1ipp3r6467");
			System.out.println("DB open");

			String sql = "INSERT INTO simplestocktable (datestamp, symbol, lastprice) values (?,?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql);

			for (int idx = 0; idx < stockList.size(); idx++) {
				Timestamp timeStamp = new Timestamp(System.currentTimeMillis());
				statement.setTimestamp(1, timeStamp);
				statement.setString(2, stockList.get(idx).symbol);
				statement.setString(3, stockList.get(idx).lastprice);

				statement.executeUpdate();

			}
			if (connection != null)
				connection.close();
			System.out.println("Connection closed !!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}