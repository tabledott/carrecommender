package modelmarkspackage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarModelController {
    @RequestMapping("/listmodels")
    public CarModel listModels() {
    	return CarModelDao.listAllCarMake();    	
  }

}
