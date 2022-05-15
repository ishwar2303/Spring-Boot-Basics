package net.codejava.servicesImpl;

import net.codejava.entities.User;
import net.codejava.services.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    List<User> list;

    public UserServiceImpl() {
        this.list = new ArrayList<>();
        this.list.add(new User(232, "Ishwar Baisla", "ishwar2303@gmail.com", "male"));
        this.list.add(new User(231, "Piyush Kumar", "piyushkumar2000@gmail.com", "male"));
        this.list.add(new User(100, "Priyanka Chopra", "priyankamiisworld@gmail.com", "female"));
    }

    @Override
    public List<User> getUsers() {
        return this.list;
    }

    @Override
    public User getUser(long id) {
        User requestedUser = null;
        for(User u : this.list) {
            if(u.getId() == id) {
                requestedUser = u;
                break;
            }
        }
        return requestedUser;
    }

    @Override
    public User addUser(User user) {
        this.list.add(user);
        return user;
    }

    @Override
    public List<User> sortByGender(String gender) {
        List<User> filteredUsers = new ArrayList<>();
        for(User u : this.list) {
            if(u.getGender().equals(gender))
                filteredUsers.add(u);
        }
        return filteredUsers;
    }
}
