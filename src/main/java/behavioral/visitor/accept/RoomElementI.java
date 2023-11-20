package behavioral.visitor.accept;

import behavioral.visitor.visit.RoomVisitor;

public interface RoomElementI {
    public void accept(RoomVisitor roomVisitor);
}
