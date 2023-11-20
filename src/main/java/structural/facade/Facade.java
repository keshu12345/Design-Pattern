package structural.facade;

public class Facade {
    private PlaceOrder placeOrder;
    private Payment payment;
    private Delivering delivering;

    public Facade() {
        placeOrder = new PlaceOrder();
        payment = new Payment();
        delivering = new Delivering();
    }

    public void completeOrder() {
        placeOrder.orderStatus();
        payment.payStatus();
        delivering.deliverStatus();
    }

}
