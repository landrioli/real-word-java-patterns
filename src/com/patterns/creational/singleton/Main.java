package com.patterns.creational.singleton;

public class Main {
    public static void main(String[] args){
        DatabaseUnitOfWork db = DatabaseUnitOfWork.GetInstance();
        System.out.println(db);

        System.out.println(db.GetContext());

        DatabaseUnitOfWork dbTwo = DatabaseUnitOfWork.GetInstance();
        System.out.println(dbTwo);
    }
}
