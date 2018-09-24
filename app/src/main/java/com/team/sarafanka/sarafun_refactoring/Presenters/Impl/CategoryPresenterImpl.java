package com.team.sarafanka.sarafun_refactoring.Presenters.Impl;

import com.team.sarafanka.sarafun_refactoring.Presenters.CategoryPresenter;
import com.team.sarafanka.sarafun_refactoring.View.Activities.CategoryActivity;
import com.team.sarafanka.sarafun_refactoring.View.CategoryIView;
import com.team.sarafanka.sarafun_refactoring.View.LoginIView;
import com.team.sarafanka.sarafun_refactoring.dto.AccountDTO;
import com.team.sarafanka.sarafun_refactoring.models.CategoryModel;
import com.team.sarafanka.sarafun_refactoring.models.Impl.CategoryModelImpl;
import com.team.sarafanka.sarafun_refactoring.models.Impl.LoginModelImpl;
import com.team.sarafanka.sarafun_refactoring.models.LoginModel;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.schedulers.Schedulers;


public class CategoryPresenterImpl implements CategoryPresenter {
    private CategoryModel model = new CategoryModelImpl();
    private Disposable disposable = Disposables.empty();
    CategoryIView view;

    public CategoryPresenterImpl(CategoryActivity view) {
        this.view = view;
    }

    @Override
    public void onStop() {
        if (!disposable.isDisposed()) {
            disposable.dispose();
        }
    }

    @Override
    public void getCounters() {
        Observable.fromCallable(()-> model.getCounters("actions/getcount?login=" + view.getCurrentAccountEmail()))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<Integer>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }
                    @Override
                    public void onNext(List<Integer> counters) {
                        view.setActionsCounters(counters);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
