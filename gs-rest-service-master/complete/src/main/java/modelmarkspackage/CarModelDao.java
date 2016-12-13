package modelmarkspackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class CarModelDao {
	private static DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		CarModelDao.dataSource = dataSource;
	}
	
	public static CarModel listAllCarMake(){

		String sql = "select distinct make from VehicleModelYear;";

		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			CarModel marks = new CarModel();
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				String make = rs.getString("make");
				System.out.println("make = " + make);
				marks.getModels().push(make);
			}
			rs.close();
			ps.close();
			return marks;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {}
			}
		}
	}

}
