package com.library.services.User;

import java.util.Map;

public interface UserService {
    String getLogin(Long userid, String userName);

    String getRegistration(Map<String, Object> param);

    Object getUserById(String emailid);
}
