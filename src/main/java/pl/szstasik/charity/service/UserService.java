package pl.szstasik.charity.service;

import pl.szstasik.charity.model.User;

public interface UserService {
    User findUserByEmail(String email);

    void saveUser(User user);
}
