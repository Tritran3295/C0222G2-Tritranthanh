package service;

import model.User;
import repository.IUserRepository;
import repository.UserRepositoryImpl;

import java.util.List;

public class UserServiceImpl implements IUserService{
    private IUserRepository iUserRepository = new UserRepositoryImpl();

    @Override
    public List<User> selectAlluser() {
        return iUserRepository.selectAllUser();
    }

    @Override
    public void add(User user) {
        iUserRepository.add(user);
    }

    @Override
    public User findById(int id) {
        return iUserRepository.findById(id);
    }

    @Override
    public void update(User user) {
        iUserRepository.update(user);
    }

    @Override
    public List<User> findByName(String name) {
        return  iUserRepository.findByName(name);
    }

    @Override
    public void deleteUser(int id) {
        iUserRepository.deleteUser(id);
    }
}
