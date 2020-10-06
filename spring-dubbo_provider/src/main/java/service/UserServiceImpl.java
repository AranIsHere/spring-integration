package service;

import entity.User;

/**
 * @Author Aran
 * @Date 2020/10/6 下午10:02
 */
public class UserServiceImpl implements UserService {


    public String getUser(String username) {
        return "hello," + username + ", success!";
    }
}


