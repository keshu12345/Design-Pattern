package behavioral.visitor.visit;

import behavioral.visitor.accept.DeluxRoom;
import behavioral.visitor.accept.DoubleRoom;
import behavioral.visitor.accept.SingleRoom;

public class RoomPricingVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoom singleRoomObj) {
        singleRoomObj.roomPrice=1000;
        System.out.print("SingleRoom pricing is :: ");
        System.out.println(singleRoomObj.roomPrice);

    }

    @Override
    public void visit(DoubleRoom doubleRoomObj) {
        doubleRoomObj.roomPrice=3000;
        System.out.print("SingleRoom pricing is :: ");
        System.out.println(doubleRoomObj.roomPrice);

    }

    @Override
    public void visit(DeluxRoom deluxRoomObj) {
        deluxRoomObj.roomPrice=2000;
        System.out.print("SingleRoom pricing is :: ");
        System.out.println(deluxRoomObj.roomPrice);

    }
}
