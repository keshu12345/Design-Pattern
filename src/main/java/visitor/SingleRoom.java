package visitor;

public class SingleRoom implements RoomElementI {

    public int roomPrice=0;
    @Override
    public void accept(RoomVisitor roomVisitor) {
        roomVisitor.visit(this);
    }
}
