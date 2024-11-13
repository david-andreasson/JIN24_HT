package se.davand.repository;

import se.davand.model.User;
import java.util.List;
import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(int id);
    List<User> findAll();
    void save(User user);
    void update(User user);
    void deleteById(int id);
}
