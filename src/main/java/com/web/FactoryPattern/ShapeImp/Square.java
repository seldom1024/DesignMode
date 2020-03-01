package com.web.FactoryPattern.ShapeImp;

import com.web.FactoryPattern.ShapeInterface.Shape;

/**
 * @description: 创建实现接口的实体类
 * @author: Seldom
 * @time: 2020/3/1 18:35
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
