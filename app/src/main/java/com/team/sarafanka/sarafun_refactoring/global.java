package com.team.sarafanka.sarafun_refactoring;


import android.app.Application;

import com.team.sarafanka.sarafun_refactoring.dto.AccountDTO;

public class global extends Application{

    private String login;
    private Boolean isFriendActions = false;
    private Boolean isMyActions = false;

    public AccountDTO getCurrentAccount() {
        return currentAccount;
    }

    public void setCurrentAccount(AccountDTO currentAccount) {
        this.currentAccount = currentAccount;
    }

    private AccountDTO currentAccount;


    public Boolean getIsFriendActions() {
        return isFriendActions;
    }

    public void setIsFriendActions(Boolean friendActions) {
        isFriendActions = friendActions;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Boolean getMyActions() {
        return isMyActions;
    }

    public void setMyActions(Boolean myActions) {
        isMyActions = myActions;
    }


}
