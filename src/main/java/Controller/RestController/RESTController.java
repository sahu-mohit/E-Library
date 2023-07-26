package Controller.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {

    @GetMapping("/")
    public String gettest(){
        System.out.println("hgjmhgj");
        return "hg";
    }
}
