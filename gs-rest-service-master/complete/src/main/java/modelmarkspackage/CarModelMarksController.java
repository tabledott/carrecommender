package modelmarkspackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarModelMarksController {

    @RequestMapping("/listmodelmarks")
    public CarModelMarks listModelMarks(@RequestParam(value="make", defaultValue="Ford") String make) {
    	ApplicationContext context =
        		new ClassPathXmlApplicationContext( "Spring-Module.xml" );

    	 CarModelMarksDao carModelDAO = (CarModelMarksDao) context.getBean("carModelMarksDao");
    	
    	return carModelDAO.findCarModelsByMark(make);
    }
}
