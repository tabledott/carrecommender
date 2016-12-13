package modelmarkspackage;

import org.springframework.web.bind.annotation.RequestMapping;

public class CarModelController {
    @RequestMapping("/listmodels")
    public CarModel listModels() {
    	return CarModelDao.listAllCarModels();    	
  }

}
