package com.team.sarafanka.sarafun_refactoring.View;


import java.util.List;

public interface CategoryIView {
    void setActionsCounters(List<Integer> counters); //Установить счетчики количества акций в категориях
    void showActions(String param); //Запустить активити с акциями, передать строку param
    String getCurrentAccountEmail();
}
