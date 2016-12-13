package modelmarkspackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        
    	ApplicationContext context =
        		new ClassPathXmlApplicationContext( "Spring-Module.xml" );
    	
            CarModelMarksDao carModelDAO = (CarModelMarksDao) context.getBean("carModelMarksDao");
            //Customer customer = new Customer(1, "mkyong",28);
            //customerDAO.insert(customer);

            CarModelMarks cars1 = carModelDAO.findCarModelsByMark("Ford");
            System.out.println("Marks are: ");
            for(int i = 0; i < cars1.getModels().size(); i++){
            	System.out.println(cars1.getModels().get(i));
            }

        SpringApplication.run(Application.class, args);
    }
}
