package FactoryDesignPattern;

public class ShapeFactory {

     Shape getShape(String inputObject){
        switch (inputObject){
            case "CIRCLE":
                return  new Circle();
            case "TRIANGLE"  :
                return new Triangle();

            default:
                return null;
        }
    }
}
