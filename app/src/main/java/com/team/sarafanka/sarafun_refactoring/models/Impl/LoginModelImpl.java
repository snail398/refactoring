package com.team.sarafanka.sarafun_refactoring.models.Impl;

import com.team.sarafanka.sarafun_refactoring.dto.AccountDTO;
import com.team.sarafanka.sarafun_refactoring.models.LoginModel;
import com.team.sarafanka.sarafun_refactoring.transfer_layer.NetworkImpl;


public class LoginModelImpl implements LoginModel {
    @Override
    public AccountDTO getAccount(String requestString) {
        NetworkImpl networkImpl = new NetworkImpl();
        return networkImpl.getDataAccount(requestString);
    }
}
