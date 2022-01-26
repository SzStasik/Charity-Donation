package pl.szstasik.charity.service;


import pl.szstasik.charity.model.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pl.szstasik.charity.model.Role;
import pl.szstasik.charity.repository.UserRepository;

import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService {

private UserRepository userRepository;
private RoleService roleService;
private BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, RoleService roleService, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleService = roleService;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setEnabled(1);
        HashSet<Role> roles = new HashSet<>();
        roles.add(roleService.findRoleByName("ROLE_USER"));
        user.setRoles(roles);
        userRepository.save(user);

    }
}
