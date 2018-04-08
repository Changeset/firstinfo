package com.changeset.model;

import java.util.Date;

/**
 * @ Author: Xuelong Liao
 * @ Description:
 * @ Date: created in 18:11 2018/4/8
 * @ ModifiedBy:
 */
public class LoginTicket {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getExpired() {
        return expired;
    }

    public void setExpired(Date expired) {
        this.expired = expired;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    private int userId;
    private Date expired;
    private int status;
    private String ticket;
}
