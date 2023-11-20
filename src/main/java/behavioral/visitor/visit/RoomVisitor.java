package behavioral.visitor.visit;

import behavioral.visitor.accept.DeluxRoom;
import behavioral.visitor.accept.DoubleRoom;
import behavioral.visitor.accept.SingleRoom;

public interface RoomVisitor {

    public void visit(SingleRoom singleRoomObj);
    public void visit(DoubleRoom doubleRoomObj);
    public void visit(DeluxRoom deluxRoomObj);
}
