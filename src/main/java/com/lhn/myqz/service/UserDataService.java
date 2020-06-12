package com.lhn.myqz.service;

import java.util.Map;

public interface UserDataService {
    //myqz01的user数据
    public Map<String,Object> getAllUserDataForMyqz01(String accountNumber, String selected);

    //myqz02的user数据
    public Map<String,Object> getAllUserDataForMyqz02(String accountNumber, String friendAccountNumber);
}
