package modelmarkspackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
    	ApplicationContext context =
        		new ClassPathXmlApplicationContext("Spring-Module.xml");

            CarModelDao carModelDAO = (CarModelDao) context.getBean("customerDAO");
            //Customer customer = new Customer(1, "mkyong",28);
            //customerDAO.insert(customer);

            Customer customer1 = customerDAO.findByCustomerId(1);
            System.out.println(customer1);


        SpringApplication.run(Application.class, args);
    }
}
