package com.team.sarafanka.sarafun_refactoring.View;


import com.team.sarafanka.sarafun_refactoring.dto.AccountDTO;

public interface LoginIView {
    String getEmail();
    String getPass();
    void SetCurrentAccount(AccountDTO currentAccount);
    void UserLogIn();
    void BarmenLogIn();
    void MarketologLogIn();
    void ShowTutorial();
    void GoToRegistrationPage();
    void ShowError();
}
