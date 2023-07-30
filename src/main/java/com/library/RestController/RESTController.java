package com.library.RestController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/rest")
public class RESTController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<?> getLogin(@RequestParam("userId") Long userid, @RequestParam("UserName") String userName){

        return ResponseEntity.ok("Suucessfully login");
    }
}
