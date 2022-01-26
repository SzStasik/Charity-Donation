package pl.szstasik.charity.service;

import pl.szstasik.charity.model.Role;

public interface RoleService {
    Role findRoleByName(String name);
}
