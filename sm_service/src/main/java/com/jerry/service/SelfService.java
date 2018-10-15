package com.jerry.service;

import com.jerry.entity.Staff;

public interface SelfService {
    Staff login(String account, String password);
    void changePassword(Integer id,String password);

}
