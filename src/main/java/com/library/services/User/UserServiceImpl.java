package com.library.services.User;

import com.library.Entity.User;
import com.library.Utility.DataTypeUtility;
import com.library.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public String getLogin(Long userid, String userName) {
        return null;
    }

    @Override
    public String getRegistration(Map<String, Object> param) {
        try{
        String firstname = DataTypeUtility.stringvlue(param.get("firstname"));
        String lastname = DataTypeUtility.stringvlue(param.get("lastname"));
        String mailId = DataTypeUtility.stringvlue(param.get("emailId"));
        String password = DataTypeUtility.stringvlue(param.get("password"));
        String contactno = DataTypeUtility.stringvlue(param.get("contact"));
        if(firstname.equals("")){
            return "First Name can not be empty";
        }
        if(lastname.equals("")){
            return "Last Name can not be empty";
        }
        if(mailId.equals("")){
            return "Mail ID can not be empty";
        }
        if(password.equals("")){
            return "Password can not be empty";
        }
        if(contactno.equals("")){
            return "Contact Number can not be empty";
        }
        password = DataTypeUtility.getEncryption(password);
        User user = new User();
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setEmailid(mailId);
        user.setPassword(password);
        user.setContactno(contactno);
        user.setIsAdmin(false);
        user.setCreatedon(DataTypeUtility.getCurrentDateInIndianFormat());
        userRepository.save(user);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "success";
    }

    @Override
    public Object getUserById(String emailid) {
        List<User>user = userRepository.findAllByEmailid(emailid);
        if(user.size() > 0){
            return user;
        }
        return "";
    }
}
