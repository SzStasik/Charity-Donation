package pl.szstasik.charity.service;

import org.springframework.stereotype.Service;
import pl.szstasik.charity.model.Role;
import pl.szstasik.charity.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService{

    private RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    @Override
    public Role findRoleByName(String name) {
        return roleRepository.findByName(name);
    }
}
