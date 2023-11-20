package structural.flyweight.game;

public class HumanoidRobot implements IRobot{

    private String type;
    private Sprites body; //small 2d bitmap (graphic element)

    public HumanoidRobot(String type, Sprites body) {
        this.type = type;
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public Sprites getBody() {
        return body;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("x: "+x+" y :"+y+" type :"+getType()+" body : "+getBody());
    }
}
