package behavioral.visitor.visit;

import behavioral.visitor.accept.DeluxRoom;
import behavioral.visitor.accept.DoubleRoom;
import behavioral.visitor.accept.SingleRoom;

public class InitiateRoomMaintenanceVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoom singleRoomObj) {
        System.out.println("Performing singleRoom of Maintenance");
    }

    @Override
    public void visit(DoubleRoom doubleRoomObj) {
        System.out.println("Performing DoubleRoom of Maintenance");
    }

    @Override
    public void visit(DeluxRoom deluxRoomObj) {
        System.out.println("Performing DeluxRoom of Maintenance");
    }
}
