package com.hnust.service;

import com.hnust.domian.User;

import java.util.List;

/**
 * @author 长夜
 * @date 2023/5/20 16:10
 */
public interface UserService {
    User selectByUsername(String username);
    Boolean insertUser(User user);
    List<User> selectAll();
    Boolean updatePassword(User user);
    Boolean deleteUser(String username);
}
