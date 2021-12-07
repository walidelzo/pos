package com.user.userBao;

import com.common.DoaException;
import com.user.beans.User;
import com.user.userDAO.UserDao;
import com.user.userDAO.UserDaoFactory;

public class UserBoa {

    public UserBoa(){

    }

    public static void main(String[] args) throws DoaException {
         UserDao fc;
        fc= new UserDaoFactory().createNewUserDao();
        User user1 = new User();
        user1.setName("ahmed");
        fc.delete(user1);
//        fc.save(user1);
    }


}
