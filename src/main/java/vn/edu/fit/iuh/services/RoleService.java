package vn.edu.fit.iuh.services;

import vn.edu.fit.iuh.entities.Role;
import vn.edu.fit.iuh.repositories.RoleRepository;

import java.util.List;
import java.util.Optional;

public class RoleService {
    private RoleRepository roleRepository;

    public RoleService(){
        this.roleRepository = new RoleRepository();
    }
    public List<Role> getAll(){
        return roleRepository.getAll(Role.class);
    }
    public Optional<Role> findOne(String roleId) throws NullPointerException{
        return roleRepository.findOne(Role.class, roleId);
    }

    public boolean add(Role role){
        return roleRepository.add(role);
    }
    public boolean update(Role role){
        return roleRepository.update(role);
    }
    public boolean delete(String roleId){
        return roleRepository.delete(Role.class, roleId);
    }
}
