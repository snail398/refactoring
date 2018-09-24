package com.team.sarafanka.sarafun_refactoring.transfer_layer;


import com.team.sarafanka.sarafun_refactoring.dto.AccountDTO;

import io.reactivex.Observable;

interface DataTransfer{
    public AccountDTO getDataAccount(String requestString);
}
