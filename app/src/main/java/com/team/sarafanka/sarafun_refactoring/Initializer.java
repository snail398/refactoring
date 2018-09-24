package com.team.sarafanka.sarafun_refactoring;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.AppCompatImageView;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;




public class Initializer {

    public void initNavigationView(final DrawerLayout drawerLayout, NavigationView navigationView) {
        global gl;
        TextView friendCounter;
        TextView actionsFromFriendsCounter;
        TextView nameFamily;
        AppCompatImageView avatar;
        gl = (global) navigationView.getContext().getApplicationContext();

        friendCounter = (TextView) MenuItemCompat.getActionView(navigationView.getMenu().findItem(R.id.myFriends));
        actionsFromFriendsCounter = (TextView) MenuItemCompat.getActionView(navigationView.getMenu().findItem(R.id.actionFromFriends));

        nameFamily = (TextView) navigationView.getHeaderView(0).findViewById(R.id.nameFamily);
        avatar =(AppCompatImageView) navigationView.getHeaderView(0).findViewById(R.id.navViewAvatar);

        //Счетчик запросов в друзья
        friendCounter.setBackgroundResource(R.drawable.red_counter) ;
        NavigationView.LayoutParams lp = new NavigationView.LayoutParams(new NavigationView.LayoutParams(navigationView.getContext().getResources().getDimensionPixelSize(R.dimen.counter_size),navigationView.getContext().getResources().getDimensionPixelSize(R.dimen.counter_size)));
        lp.setMargins(0,25,15,0);
        friendCounter.setLayoutParams(lp);
        friendCounter.setGravity(Gravity.CENTER_VERTICAL);
        friendCounter.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        friendCounter.setTextSize(14);
        friendCounter.setVisibility(View.INVISIBLE);
      //  gl.getUser().getCountOfFriendRequest(friendCounter);

        //Инициализация хедера
        Button bonusButton = (Button) navigationView.getHeaderView(0).findViewById(R.id.bonusButton);
        AppCompatImageButton userSettings = (AppCompatImageButton) navigationView.findViewById(R.id.userSettingsButton);

        bonusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   Intent intent3 = new Intent(drawerLayout.getContext(), CouponsActivity.class);
             //   drawerLayout.getContext().startActivity(intent3);
            }
        });


        View.OnClickListener goToUserProfile = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   Intent intent3 = new Intent(drawerLayout.getContext(), UserSettingsActivity.class);
             //   drawerLayout.getContext().startActivity(intent3);
            }
        };

        userSettings.setOnClickListener(goToUserProfile);
        nameFamily.setOnClickListener(goToUserProfile);
        avatar.setOnClickListener(goToUserProfile);

        //Установка информации о пользователе
        nameFamily.setText(gl.getCurrentAccount().getFirstName()+ " "+ gl.getCurrentAccount().getSecondName());
      //  gl.getUser().getCountOfCoupons((TextView) navigationView.getHeaderView(0).findViewById(R.id.countOfBonus));
     //   gl.getUser().setAvatar(navigationView.getContext(),gl.getUser().getLogin(),avatar,true);

        //Инициализация пунктов меню
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                drawerLayout.closeDrawers();
                /*
                switch(item.getItemId()){
                    case R.id.category:
                        if(!(drawerLayout.getContext().getClass()).equals(CategoryActivity.class)){
                        Intent intent = new Intent(drawerLayout.getContext(), CategoryActivity.class);
                        ((AppCompatActivity) drawerLayout.getContext()).finish();
                        drawerLayout.getContext().startActivity(intent);
                        }

                        break;
                    case R.id.myActions:
                        Intent intent1 = new Intent(drawerLayout.getContext(), MyActionActivity.class);
                        if(!(drawerLayout.getContext()).getClass().equals(CategoryActivity.class)){
                            ((AppCompatActivity) drawerLayout.getContext()).finish();
                        }
                        else  intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        drawerLayout.getContext().startActivity(intent1);
                        break;
                    case R.id.allActions:
                        Intent intent3 = new Intent(drawerLayout.getContext(), UsersActionActivity.class);
                        if(!(drawerLayout.getContext().getClass()).equals(CategoryActivity.class)){
                            ((AppCompatActivity) drawerLayout.getContext()).finish();
                        }
                        else  intent3.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        intent3.putExtra("category","all");
                        drawerLayout.getContext().startActivity(intent3);
                        break;
                    case R.id.myFriends:
                        Intent intent4 = new Intent(drawerLayout.getContext(), FriendsActivity.class);
                        if(!(drawerLayout.getContext().getClass()).equals(CategoryActivity.class)){
                            ((AppCompatActivity) drawerLayout.getContext()).finish();
                        }
                        else  intent4.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        drawerLayout.getContext().startActivity(intent4);
                        break;
                    case R.id.actionFromFriends:
                        Intent intent2 = new Intent(drawerLayout.getContext(), ActionFromFriendsActivity.class);
                        if(!(drawerLayout.getContext().getClass()).equals(CategoryActivity.class)){
                            ((AppCompatActivity) drawerLayout.getContext()).finish();
                        }
                        else  intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        drawerLayout.getContext().startActivity(intent2);
                        break;
                }*/
                return true;

            }

        });
    }

    public  void initToolbar(AppCompatActivity activity, final DrawerLayout drawerLayout, android.support.v7.widget.Toolbar toolbar, String toolbarTitle){

        toolbar.setTitle(toolbarTitle);
        activity.setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(Color.WHITE);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(activity,drawerLayout,toolbar,R.string.default_login,R.string.default_password);
        actionBarDrawerToggle.setDrawerSlideAnimationEnabled(true);


        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

    }

    public  void initBackToolbar(final AppCompatActivity activity, android.support.v7.widget.Toolbar toolbar, String toolbarTitle){

        toolbar.setTitle(toolbarTitle);
        activity.setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(Color.WHITE);
        activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        activity.getSupportActionBar().setDisplayShowHomeEnabled(true);

        //переобределяем поведение стрелочки назад в тулбаре
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.onBackPressed();
            }
        });
    }



    public void initMarketologNavigationView(final DrawerLayout drawerLayout, NavigationView navigationView) {
        global gl;
        gl = (global) navigationView.getContext().getApplicationContext();

        TextView nameFamily = (TextView) navigationView.getHeaderView(0).findViewById(R.id.nameFamily);

       // gl.getMarketolog().setMarketologCompany(nameFamily);
        //Инициализация пунктов меню
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                drawerLayout.closeDrawers();
                /*
                switch(item.getItemId()){
                    case R.id.marketolog_actions:
                        Intent intent = new Intent(drawerLayout.getContext(), MarketologActionsActivity.class);
                        if(!(drawerLayout.getContext().getClass()).equals(MarketologNewActivity.class)){
                            ((AppCompatActivity) drawerLayout.getContext()).finish();

                        }
                        else  intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        drawerLayout.getContext().startActivity(intent);
                        break;
                    case R.id.marketolog_statistics:
                        Intent intent1 = new Intent(drawerLayout.getContext(), MarketologStatisticsActivity.class);
                        if(!(drawerLayout.getContext()).getClass().equals(MarketologNewActivity.class)){
                            ((AppCompatActivity) drawerLayout.getContext()).finish();
                        }
                        else  intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        drawerLayout.getContext().startActivity(intent1);
                        break;
                    case R.id.marketolog_scan:
                        Intent intent3 = new Intent(drawerLayout.getContext(), MarketologScanActivity.class);
                        if(!(drawerLayout.getContext().getClass()).equals(MarketologNewActivity.class)){
                            ((AppCompatActivity) drawerLayout.getContext()).finish();
                        }
                        else  intent3.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        drawerLayout.getContext().startActivity(intent3);
                        break;
                    case R.id.marketolog_profile:
                        Intent intent4 = new Intent(drawerLayout.getContext(), MarketologProfileActivity.class);
                        if(!(drawerLayout.getContext().getClass()).equals(MarketologNewActivity.class)){
                            ((AppCompatActivity) drawerLayout.getContext()).finish();
                        }
                        else  intent4.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        drawerLayout.getContext().startActivity(intent4);
                        break;
                    case R.id.marketolog_est:
                        Intent intent5 = new Intent(drawerLayout.getContext(), MarketologEstablishmentActivity.class);
                        if(!(drawerLayout.getContext().getClass()).equals(MarketologNewActivity.class)){
                            ((AppCompatActivity) drawerLayout.getContext()).finish();
                        }
                        else  intent5.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        drawerLayout.getContext().startActivity(intent5);
                        break;
                    case R.id.marketolog_staff:
                        Intent intent6 = new Intent(drawerLayout.getContext(), MarketologStaffActivity.class);
                        if(!(drawerLayout.getContext().getClass()).equals(MarketologNewActivity.class)){
                            ((AppCompatActivity) drawerLayout.getContext()).finish();
                        }
                        else  intent6.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        drawerLayout.getContext().startActivity(intent6);
                        break;
                }
                */
                return true;
            }
        });
    }
}
