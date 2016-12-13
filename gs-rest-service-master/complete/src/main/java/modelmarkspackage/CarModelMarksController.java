package modelmarkspackage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarModelMarksController {

    @RequestMapping("/listmodelmarks")
    public CarModelMarks greeting(@RequestParam(value="mark", defaultValue="Ford") String mark) {
    	CarModelMarksDao tmp = new CarModelMarksDaoJDBC();    	
    	return tmp.findCarModelsByMark(mark);
    }
}
