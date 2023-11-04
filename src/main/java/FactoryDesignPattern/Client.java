package FactoryDesignPattern;

public class Client {
    public static void main(String []args) {
        ShapeFactory shapeFactoryObj = new ShapeFactory();
        Shape shape=shapeFactoryObj.getShape("CIRCLE");
        shape.draw();
        shape=shapeFactoryObj.getShape("TRIANGLE");
        shape.draw();

    }

}
