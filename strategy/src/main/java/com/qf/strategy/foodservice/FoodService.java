package com.qf.strategy.foodservice;

import com.qf.strategy.pojo.po.Foods;
import com.qf.strategy.pojo.po.Sport;

import java.util.List;

public interface FoodService {
    List<Foods> findByName(String cityname);
}
