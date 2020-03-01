package com.web.FactoryPattern.ShapeImp;

import com.web.FactoryPattern.ShapeInterface.Shape;

/**
 * @description: 创建实现接口的实体类
 * @author: Seldom
 * @time: 2020/3/1 18:34
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}