package modelmarkspackage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

public class CarModelMarksDaoJDBC implements CarModelMarksDao {
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void insert(){
		
	}
	
	/*
	public void insert(DataSource customer){

		String sql = "UPDATE INTO CUSTOMER " +
				"(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, customer.getCustId());
			ps.setString(2, customer.getName());
			ps.setInt(3, customer.getAge());
			ps.executeUpdate();
			ps.close();

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
	*/
	public CarModelMarks findCarModelsByMark(String mark){

		//'
		String sql = "select distinct model from VehicleModelYear where make= ?";

		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, mark);
			CarModelMarks marks = new CarModelMarks(mark);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				String model = rs.toString();
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