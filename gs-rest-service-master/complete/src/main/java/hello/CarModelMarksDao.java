package hello;

public interface CarModelMarksDao {
	public void insert(CarModelMarks models);
	public CarModelMarks findCarModelMarksByMark(String mark);

}
