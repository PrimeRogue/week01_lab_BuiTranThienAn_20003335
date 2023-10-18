package vn.edu.fit.iuh.services;

import vn.edu.fit.iuh.entities.GrantAccess;
import vn.edu.fit.iuh.repositories.GrantAccessRepository;

import java.util.List;
import java.util.Optional;

public class GrantAccessService {
    private GrantAccessRepository grantAccessRepository ;


    public GrantAccessService(){
        this.grantAccessRepository = new GrantAccessRepository();
    }

    public boolean add(GrantAccess grantAccess){
        return grantAccessRepository.add((grantAccess));
    }
    public boolean update(GrantAccess grantAccess){
        return grantAccessRepository.update(grantAccess);
    }
    public List<GrantAccess> getAll(){
        return grantAccessRepository.getAll();
    }

    public Optional<GrantAccess> findOne(String accountId, String roleId){
        return grantAccessRepository.findOne(accountId, roleId);
    }
    public boolean delete(String accountId, String roleId){
        return grantAccessRepository.delete(accountId, roleId);
    }
}
