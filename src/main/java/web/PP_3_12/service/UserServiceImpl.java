package web.PP_3_12.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.PP_3_12.model.User;
import web.PP_3_12.repositories.UserRepository;


import java.util.List;
import java.util.Optional;


@Service
@Transactional(readOnly = true)
public class UserServiceImpl {

    private final UserRepository usersRepository;

    public UserServiceImpl(UserRepository usersRepository) {
        this.usersRepository = usersRepository;
    }
    public List<User> findAll() {
        return usersRepository.findAll();
    }

    public User findOne(int id) {
        Optional<User> foundUsers = usersRepository.findById(id);
        return foundUsers.orElse(null);
    }

    @Transactional
    public void save(User user){
        usersRepository.save(user);
    }

    @Transactional
    public void update(int id, User userUp) {
        userUp.setId(id);
        usersRepository.save(userUp);
    }

    @Transactional
    public void delete(int id) {
        usersRepository.deleteById(id);
    }
}
