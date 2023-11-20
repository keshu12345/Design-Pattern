package structural.flyweight;

public class BoldText implements TextFormatter{
    @Override
    public void apply(String text) {
        System.out.println("Bold : "+text);
    }
}
