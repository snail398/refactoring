package com.team.sarafanka.sarafun_refactoring.Presenters.Impl;



import com.team.sarafanka.sarafun_refactoring.Presenters.LoginPresenter;
import com.team.sarafanka.sarafun_refactoring.View.LoginIView;
import com.team.sarafanka.sarafun_refactoring.dto.AccountDTO;
import com.team.sarafanka.sarafun_refactoring.models.LoginModel;
import com.team.sarafanka.sarafun_refactoring.models.Impl.LoginModelImpl;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.schedulers.Schedulers;


public class LoginPresenterImpl implements LoginPresenter {

    private LoginModel model = new LoginModelImpl();
    private LoginIView view;
    private Disposable disposable = Disposables.empty();

    public LoginPresenterImpl(LoginIView view) {
        this.view = view;
    }

    @Override
    public void onLogInClick() {
        if (!disposable.isDisposed()) {
            disposable.dispose();
        }

        Observable.fromCallable(()-> model.getAccount("login?login=" + view.getEmail() + "&pass=" + view.getPass()))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<AccountDTO>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }
                    @Override
                    public void onNext(AccountDTO accountDTO) {
                        switch (accountDTO.getAccountType()) {
                            case "user":
                                view.SetCurrentAccount(accountDTO);
                                view.UserLogIn();
                                break;
                            case "barmen":
                                view.SetCurrentAccount(accountDTO);
                                break;
                            case "marketolog":
                                view.SetCurrentAccount(accountDTO);
                                break;
                            case "none":
                                view.ShowError();
                                break;
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        view.ShowError();
                    }

                    @Override
                    public void onComplete() {

                    }
                });


    }

    @Override
    public void onStop() {
        if (!disposable.isDisposed()) {
            disposable.dispose();
        }
    }

}

