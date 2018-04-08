package com.changeset.model;

import org.springframework.stereotype.Component;

/**
 * @ Author: Xuelong Liao
 * @ Description:
 * @ Date: created in 18:54 2018/4/8
 * @ ModifiedBy:
 */
@Component
public class HostHolder {
    private static ThreadLocal<User> users = new ThreadLocal<>();

    public User getUser() {
        return users.get();
    }

    public void setUser(User user) {
        users.set(user);
    }

    public void clear() {
        users.remove();
    }
}
