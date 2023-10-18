package vn.edu.fit.iuh.services;

import vn.edu.fit.iuh.entities.Account;
import vn.edu.fit.iuh.repositories.AccountRepository;

import java.util.List;
import java.util.Optional;

public class AccountService {
    private AccountRepository accountRepository;

    public AccountService(){
        this.accountRepository = new AccountRepository();
    }

    public Optional<Account> login(String accountId, String password) throws NullPointerException{
        return accountRepository.login(accountId, password);
    }
    public List<Account> getAccountsByRoleId(String roleId) {
        return accountRepository.getAccountsByRoleId(roleId);
    }

    public List<Account> getAll(){
        return accountRepository.getAll(Account.class);
    }

    public boolean add(Account account){
        return accountRepository.add(account);
    }

    public boolean update(Account account){ return accountRepository.update(account);}


    public boolean delete(String accountId) { return accountRepository.delete(Account.class, accountId);}

    public Optional<Account> findOne(String accountId) throws NullPointerException{
        return accountRepository.findOne(Account.class, accountId);
    }

}
