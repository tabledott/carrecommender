package modelmarkspackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarModelController {
    @RequestMapping("/listmakes")
    public CarModel listMakes() {
    	
    	ApplicationContext context =
        		new ClassPathXmlApplicationContext( "Spring-Module.xml" );

    	 CarModelDao carModelDAO = (CarModelDao) context.getBean("carModelDao");

    	return carModelDAO.listAllCarMake();    	
  }

}
