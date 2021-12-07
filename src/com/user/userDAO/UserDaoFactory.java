package com.user.userDAO;

public class UserDaoFactory {
    public UserDao createNewUserDao(){
        return new UserDoaImp();
    }
}
