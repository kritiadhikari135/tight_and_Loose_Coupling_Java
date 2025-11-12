package com.loose.coupling;

public class LooseCouplingExample {
    public static  void  main(String[] args){
        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());


        UserDataProvider databaseProviderwithnewdb = new WithNewDatabase();
        UserManager userManagerWithnewDB = new UserManager(databaseProviderwithnewdb);
        System.out.println(userManagerWithnewDB.getUserInfo());



    }
}
