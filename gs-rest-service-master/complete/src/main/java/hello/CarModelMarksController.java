package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarModelMarksController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/listmarks")
    public CarModelMarks greeting(@RequestParam(value="name", defaultValue="Ford") String mark) {
        return new CarModelMarks(mark);
    }
}
