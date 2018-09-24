package com.team.sarafanka.sarafun_refactoring.View.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.team.sarafanka.sarafun_refactoring.Presenters.Impl.LoginPresenterImpl;
import com.team.sarafanka.sarafun_refactoring.R;
import com.team.sarafanka.sarafun_refactoring.View.LoginIView;
import com.team.sarafanka.sarafun_refactoring.dto.AccountDTO;
import com.team.sarafanka.sarafun_refactoring.global;


public class LoginActivity extends AppCompatActivity implements LoginIView {
    global gl;
    LoginPresenterImpl presenter = new LoginPresenterImpl(this);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        gl = (global) getApplicationContext();
        ((Button) findViewById(R.id.button)).setOnClickListener(v->presenter.onLogInClick());
        ((Button) findViewById(R.id.buttonRegistration)).setOnClickListener(v->GoToRegistrationPage());
        ((Button) findViewById(R.id.buttonTutorial)).setOnClickListener(v->ShowTutorial());
    }

    @Override
    public String getEmail() {
        return ((EditText) findViewById(R.id.login)).getText().toString();
    }

    @Override
    public String getPass() {
        return ((EditText) findViewById(R.id.password)).getText().toString();
    }

    @Override
    public void SetCurrentAccount(AccountDTO currentAccount) {

        gl.setCurrentAccount(currentAccount);
    }

    @Override
    public void UserLogIn() {
        Toast.makeText(this, "Добро пожаловать,Друг", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,CategoryActivity.class);
        startActivity(intent);
    }

    @Override
    public void BarmenLogIn() {
        Toast.makeText(this, "Добро пожаловать,Бармен", Toast.LENGTH_LONG).show();
        //Переход на активити бармена
    }

    @Override
    public void MarketologLogIn() {
        Toast.makeText(this, "Добро пожаловать,Маркетолог", Toast.LENGTH_LONG).show();
        //Переход на активити маркетолога
    }

    @Override
    public void ShowError(){
        Toast.makeText(this, "Такого аккаунта нет", Toast.LENGTH_LONG).show();
    }

    @Override
    public void ShowTutorial() {
        //Переход на активити туториал
    }

    @Override
    public void GoToRegistrationPage() {
        //Переход на активити регистрации
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (presenter != null) {
            presenter.onStop();
        }
    }
}
