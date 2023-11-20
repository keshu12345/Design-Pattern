package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TextFormatFactory {

    Map<String,TextFormatter> formatterMap=new HashMap<>();
    TextFormatter getFormatting(String style) throws IllegalAccessException {
        if(!formatterMap.containsKey(style)){
            return switch (style) {
                case "regular" -> new RegularText();
                case "bold" -> new BoldText();
                default -> throw new IllegalAccessException("Unknown text formatting style: " + style);
            };
        }
        return formatterMap.get(style);
    }
}
