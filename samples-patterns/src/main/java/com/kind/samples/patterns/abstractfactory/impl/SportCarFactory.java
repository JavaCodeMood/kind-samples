package com.kind.samples.patterns.abstractfactory.impl;

import com.kind.samples.patterns.abstractfactory.AbstractFactory;
import com.kind.samples.patterns.abstractfactory.BmwCarFactory;
import com.kind.samples.patterns.abstractfactory.BenzCarFactory;

/**
 * Created by weiguo.liu on 2016/10/14.
 */
public class SportCarFactory implements AbstractFactory {
    @Override
    public BmwCarFactory createBmwCar() {
        return new BmwSportCar();
    }

    @Override
    public BenzCarFactory createBenzCar() {
        return new BenzSportCar();
    }
}
