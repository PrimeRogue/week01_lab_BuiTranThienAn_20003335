package vn.edu.fit.iuh.services;

import vn.edu.fit.iuh.entities.Log;
import vn.edu.fit.iuh.repositories.LogRepository;

import java.util.List;

public class LogService {
    private LogRepository logRepository;

    public LogService(){
        this.logRepository = new LogRepository();
    }
    public boolean updateLogoutTime(String accountId){
        return logRepository.updateLogoutTime(accountId);
    }
    public boolean add(Log log){
        return logRepository.add(log);
    }
    public List<Log> getAll(){
        return logRepository.getAll(Log.class);
    }

    public boolean update(Log log){
        return logRepository.update(log);
    }

    public boolean delete(long id){
        return logRepository.delete(Log.class, id);
    }
}
