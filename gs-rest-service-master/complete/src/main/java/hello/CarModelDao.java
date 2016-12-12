package hello;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class CarModelDao {
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public CarModel listAllCarModels(){

		String sql = "select distinct make from VehicleModelYear;";

		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			CarModel marks = new CarModel();
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				String model = rs.getString("MODEL");
				System.out.println("model = " + model);
				marks.getModels().push(model);
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
