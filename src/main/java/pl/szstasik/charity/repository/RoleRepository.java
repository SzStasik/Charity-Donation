package pl.szstasik.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.szstasik.charity.model.Role;

public interface RoleRepository extends JpaRepository <Role, Long>{
    Role findByName(String name);
}
