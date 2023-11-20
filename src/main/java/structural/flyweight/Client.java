package structural.flyweight;

public class Client {
    public static void main(String[] args) throws IllegalAccessException {
        TextFormatFactory formatFactory=new TextFormatFactory();

        // Text content with formatting
        String[] content = {
                "This is ",
                "bold",
                " and this is ",
                "regular",
                " text."
        };

        for(String text:content){
            TextFormatter textFormatter;
            if(text.equals("bold")){
                textFormatter=formatFactory.getFormatting(text);
            }else{
                textFormatter=formatFactory.getFormatting("regular");
            }
            textFormatter.apply(text);
        }

    }
}
