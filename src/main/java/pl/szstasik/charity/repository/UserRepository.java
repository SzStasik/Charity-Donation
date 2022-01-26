package pl.szstasik.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.szstasik.charity.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
