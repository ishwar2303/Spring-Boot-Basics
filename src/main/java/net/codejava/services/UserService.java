package net.codejava.services;

import net.codejava.entities.User;

import java.util.List;

public interface UserService {
    public List<User> getUsers();
    public User getUser(long id);

    public User addUser(User user);

    public List<User> sortByGender(String gender);
}
