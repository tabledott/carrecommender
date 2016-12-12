package hello;

import java.util.List;
import java.util.LinkedList;

public class CarModel{
	
	private LinkedList<String> models;
	
	public CarModel(){
		models = new LinkedList<String>();
	}
	
	public LinkedList<String> getModels(){
		return models;
	}
}