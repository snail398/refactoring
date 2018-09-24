package com.team.sarafanka.sarafun_refactoring.transfer_layer;

import com.team.sarafanka.sarafun_refactoring.dto.AccountDTO;



public class NetworkTestImpl implements DataTransfer{
    @Override
    public AccountDTO getDataAccount(String requestString) {
        AccountDTO acc = new AccountDTO();
        acc.setAccountType("user");
        return acc;
    }
}
