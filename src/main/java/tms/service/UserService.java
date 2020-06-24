package tms.service;

import org.springframework.stereotype.Service;
import tms.entity.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> userList = new ArrayList<>();

    public void addUser( User user){
        check(user);
        userList.add(user);
    }

    private User check(User user){
        if (user.getName().equals("")||user.getLogin().equals("")||user.getPassword().equals("")){
            throw new NullPointerException();
            }
        return user;
    }


    private User getUserByLogin(String login){
        for (User user: userList) {
            if (user.getLogin().equals(login)){
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public User checkAuth (User user){
        User userByLogin = getUserByLogin(user.getLogin());
        if (userByLogin.getPassword().equals(user.getPassword())){
            return userByLogin;
        }
        throw new UserNotFoundException("Password incorrect");
    }

}
