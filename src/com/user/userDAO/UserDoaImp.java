package com.user.userDAO;

import com.common.DoaException;
import com.user.beans.User;

import java.io.FileInputStream;

public class UserDoaImp implements UserDao{
    private Object DoaException;

    @Override
    public void save(User user) {
        System.out.println("save user " + user.getName());
    }

    @Override
    public void update(User user) {
        System.out.println("update user " + user.getName());
    }

    @Override
    public void delete(User user) throws DoaException {
        int x = 1;
        try {
            if (x==1){
                System.out.println("delete user " + user.getName());
                throw  new DoaException();
        }
        }
        catch (DoaException e){
            System.out.println(e);

        }    }

    @Override
    public User[] findById(int id) {
        return null;
    }
}
