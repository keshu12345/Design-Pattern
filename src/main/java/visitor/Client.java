package visitor;

public class Client {
    public static void main(String[] args) {
        RoomElementI singleRoomObj = new SingleRoom();
        RoomElementI doubleRoomObj = new DoubleRoom();
        RoomElementI deluxRoomObj = new DeluxRoom();
        RoomVisitor roomPricingVisitorObj = new RoomPricingVisitor();
        singleRoomObj.accept(roomPricingVisitorObj);
        doubleRoomObj.accept(roomPricingVisitorObj);
        deluxRoomObj.accept(roomPricingVisitorObj);
        RoomVisitor roomMaintenanceVisitorObj=new InitiateRoomMaintenanceVisitor();
        singleRoomObj.accept(roomMaintenanceVisitorObj);
        doubleRoomObj.accept(roomMaintenanceVisitorObj);
        deluxRoomObj.accept(roomMaintenanceVisitorObj);

    }

}
