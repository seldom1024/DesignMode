package com.web.FactoryPattern;

import com.web.FactoryPattern.ShapeImp.Circle;
import com.web.FactoryPattern.ShapeImp.Rectangle;
import com.web.FactoryPattern.ShapeImp.Square;
import com.web.FactoryPattern.ShapeInterface.Shape;

/**
 * @description:
 * @author: Seldom
 * @time: 2020/3/1 19:13
 */
class ShapeFactory {
    /**
     *  使用 getShape 方法获取形状类型的对象
     * @param shapeType
     * @return
     */
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
