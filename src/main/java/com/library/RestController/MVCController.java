package com.library.RestController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MVCController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String test(){
        return  "index";
    }
}
