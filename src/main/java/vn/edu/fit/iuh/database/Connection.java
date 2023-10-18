package vn.edu.fit.iuh.database;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connection {
    private static Connection instance;
    private EntityManagerFactory emf;

    private Connection(){
        emf = Persistence.createEntityManagerFactory("week01_lab_BuiTranThienAn_20003335");
    }
    public static Connection getInstance(){
        if (instance == null){
            instance = new Connection();
        }
        return instance;
    }
    public EntityManagerFactory getEntityManagerFactory(){
        return emf;
    }

}