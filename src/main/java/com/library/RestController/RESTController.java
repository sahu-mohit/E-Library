package com.library.RestController;

import com.library.services.User.UserService;
import com.sun.istack.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/rest")
public class RESTController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<?> getLogin(@RequestBody @Nullable Map<String,Object> param){
        Map<String, Object> login = userService.getLogin(param);
        return new ResponseEntity(login ,HttpStatus.OK);
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ResponseEntity<?> getRegistration(@RequestBody @Nullable Map<String,Object> param){
        String registration = userService.getRegistration(param);
        return ResponseEntity.ok(registration);
    }
    @RequestMapping(value = "/get-user-by-id", method = RequestMethod.GET)
    public ResponseEntity<?> getUserById(@RequestParam("userid") @Nullable String emailid){
        Object data = userService.getUserById(emailid);
        return ResponseEntity.ok(Optional.of(data));
    }
}
