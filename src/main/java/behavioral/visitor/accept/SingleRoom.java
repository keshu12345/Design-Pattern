package behavioral.visitor.accept;

import behavioral.visitor.visit.RoomVisitor;

public class SingleRoom implements RoomElementI {

    public int roomPrice=0;
    @Override
    public void accept(RoomVisitor roomVisitor) {
        roomVisitor.visit(this);
    }
}
