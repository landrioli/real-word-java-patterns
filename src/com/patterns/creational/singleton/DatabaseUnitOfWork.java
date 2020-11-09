package com.patterns.creational.singleton;

public class DatabaseUnitOfWork {
    private static volatile DatabaseUnitOfWork database = null;

    private DatabaseUnitOfWork(){ }

    public static DatabaseUnitOfWork GetInstance(){
        if(database == null){
            synchronized (DatabaseUnitOfWork.class){
                if(database == null)
                    database = new DatabaseUnitOfWork();
            }
        }
        return database;
    }

    public String GetContext(){
        return "Mocked response";
    }
}
