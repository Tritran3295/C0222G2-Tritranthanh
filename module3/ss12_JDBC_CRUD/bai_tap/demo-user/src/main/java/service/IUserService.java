package service;

import model.User;

import java.util.List;

public interface IUserService {
    List<User> selectAlluser();

    void add(User user);


    User findById(int id);

    void update(User user);


    List<User> findByName(String name);


    void deleteUser(int id);
}
