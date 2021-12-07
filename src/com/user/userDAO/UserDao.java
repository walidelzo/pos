package com.user.userDAO;

import com.common.DOAOperation;
import com.common.DoaException;
import com.user.beans.User;

public interface UserDao extends DOAOperation<User>  {
    public void delete(User user) throws DoaException;

}
