package structural.flyweight;

public class RegularText implements TextFormatter{
    @Override
    public void apply(String text) {
        System.out.println("Regular: "+text);
    }
}
