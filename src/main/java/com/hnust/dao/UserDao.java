package com.hnust.dao;

import com.hnust.domian.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 长夜
 * @date 2023/5/20 16:06
 */
@Mapper
public interface UserDao {
    User selectByUsername(String username);
    Boolean insertUser(User user);
    List<User> selectAll();
    Boolean updatePassword(User user);
    Boolean deleteUser(String username);
}
