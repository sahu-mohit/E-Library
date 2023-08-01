package com.library.services.User;

import java.util.Map;

public interface UserService {
   public Map<String, Object> getLogin(Map<String, Object> param);

    String getRegistration(Map<String, Object> param);

    Object getUserById(String emailid);
}
