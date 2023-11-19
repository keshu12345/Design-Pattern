package FactoryDesignPattern;

public class ShapeFactory {

    Shape getShape(String inputObject){
        return switch (inputObject) {
            case "CIRCLE" -> new Circle();
            case "TRIANGLE" -> new Triangle();
            default -> null;
        };
    }

     Shape getShapeOld(String inputObject){
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
