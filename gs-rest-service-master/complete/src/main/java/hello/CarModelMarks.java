package hello;
import java.util.LinkedList;

public class CarModelMarks {
	private String model;
	private LinkedList<String> marks;
	
	public CarModelMarks(String model){
		this.model = model;
		this.marks = new LinkedList<String>();
	}
	
	public LinkedList<String> getModels(){
		return this.marks;
	}
}
