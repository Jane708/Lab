package javaweb.repository;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import javaweb.model.entity.Product;

public class ShowBaseDao {
	protected static Connection conn;
	
	static {
		String username = "root";
		String password = "000000";
		String dbUrl = "jdbc:mysql://localhost:3306/web";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbUrl, username, password);
		} catch (SQLException | ClassNotFoundException e) {
	
			e.printStackTrace();
		}
	}
	
	public List<Show> findAllShows() {
		return null;
	}
}
