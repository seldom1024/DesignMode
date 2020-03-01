package com.web.FactoryPattern.ShapeImp;

import com.web.FactoryPattern.ShapeInterface.Shape;

/**
 * @description:
 * @author: Seldom
 * @time: 2020/3/1 18:35
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
