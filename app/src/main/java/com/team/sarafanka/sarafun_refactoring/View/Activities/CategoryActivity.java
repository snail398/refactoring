package com.team.sarafanka.sarafun_refactoring.View.Activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.team.sarafanka.sarafun_refactoring.AppCompatActivityWithMenu;
import com.team.sarafanka.sarafun_refactoring.Initializer;
import com.team.sarafanka.sarafun_refactoring.Presenters.CategoryPresenter;
import com.team.sarafanka.sarafun_refactoring.Presenters.Impl.CategoryPresenterImpl;
import com.team.sarafanka.sarafun_refactoring.Presenters.Impl.LoginPresenterImpl;
import com.team.sarafanka.sarafun_refactoring.R;
import com.team.sarafanka.sarafun_refactoring.View.CategoryIView;
import com.team.sarafanka.sarafun_refactoring.global;

import java.util.List;


public class CategoryActivity extends AppCompatActivityWithMenu implements CategoryIView {

    global gl;
    CategoryPresenter presenter = new CategoryPresenterImpl(this);


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_category1);
        gl = (global) getApplicationContext();
        presenter.getCounters();

        Initializer initManager = new Initializer();
        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout_category);
        Toolbar mActionBarToolbar = (Toolbar) findViewById(R.id.toolbar);
        final NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        initManager.initNavigationView(drawerLayout,navigationView);
        initManager.initToolbar(this,drawerLayout,mActionBarToolbar,"Sarafanka");


        findViewById(R.id.category_show_all_actions).setOnClickListener(v->showActions("all"));
        findViewById(R.id.smokeButton).setOnClickListener(v->showActions("smoke"));
        findViewById(R.id.drinkButton).setOnClickListener(v->showActions("drink"));
        findViewById(R.id.eatButton).setOnClickListener(v->showActions("eat"));
        findViewById(R.id.movieButton).setOnClickListener(v->showActions("movie"));
        findViewById(R.id.gameButton).setOnClickListener(v->showActions("game"));
    }

    @Override
    public void setActionsCounters(List<Integer> counters) {
        ((TextView) findViewById(R.id.smokeCount)).setText(counters.get(0).toString());
        ((TextView) findViewById(R.id.drinkCount)).setText(counters.get(1).toString());
        ((TextView) findViewById(R.id.eatCount)).setText(counters.get(2).toString());
        ((TextView) findViewById(R.id.movieCount)).setText(counters.get(3).toString());
        ((TextView) findViewById(R.id.gameCount)).setText(counters.get(4).toString());
    }

    @Override
    public void showActions(String param) {
        //Переход на активити с акциями
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (presenter != null) {
            presenter.onStop();
        }
    }

    @Override
    public String getCurrentAccountEmail() {
        return gl.getCurrentAccount().getLogin();
    }
}
