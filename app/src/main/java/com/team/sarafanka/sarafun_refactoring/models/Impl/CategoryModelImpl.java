package com.team.sarafanka.sarafun_refactoring.models.Impl;

import com.team.sarafanka.sarafun_refactoring.models.CategoryModel;
import com.team.sarafanka.sarafun_refactoring.transfer_layer.NetworkImpl;

import java.util.List;

/**
 * Created by lolol on 22.09.2018.
 */

public class CategoryModelImpl implements CategoryModel {
    @Override
    public List<Integer> getCounters(String requestString) {
        NetworkImpl networkImpl = new NetworkImpl();
        return networkImpl.getListOfInteger(requestString);
    }
}
