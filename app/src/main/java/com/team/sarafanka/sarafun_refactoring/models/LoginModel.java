package com.team.sarafanka.sarafun_refactoring.models;


import com.team.sarafanka.sarafun_refactoring.dto.AccountDTO;

import io.reactivex.Observable;

public interface LoginModel {
    AccountDTO getAccount(String requestString);
}
