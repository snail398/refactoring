package com.team.sarafanka.sarafun_refactoring.Presenters;


import java.util.List;

public interface CategoryPresenter extends BasePresenter{
    void getCounters(); //Асинхронный запрос у модели данных о количестве акций в каждой категории
}
