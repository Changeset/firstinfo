package com.changeset.firstinfo.service;

import com.changeset.firstinfo.dao.UserDAO;
import com.changeset.firstinfo.model.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ Author: Xuelong Liao
 * @ Description:
 * @ Date: created in 16:30 2018/4/4
 * @ ModifiedBy:
 */
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public User getUser(int id) { return userDAO.selectById(id); }
}
