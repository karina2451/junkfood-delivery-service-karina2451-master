import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.lecture.Delivery;
import org.lecture.DeliveryDestination;

public class TestDelivery {

    @Test
    public void testGetDeliveryCostsEisenstadt() {
        DeliveryDestination destination = DeliveryDestination.EISENSTADT;
        Delivery d = new Delivery();
        double deliveryCosts = d.getDeliveryCosts(destination);
        Assertions.assertEquals(2, deliveryCosts);
    }

    @Test
    public void testGetDeliveryCostsVienna() {
        DeliveryDestination destination = DeliveryDestination.VIENNA;
        Delivery d = new Delivery();
        double deliveryCosts = d.getDeliveryCosts(destination);
        Assertions.assertEquals(4, deliveryCosts);
    }

    @Test
    public void testGetDeliveryCostsPinkafeld() {
        DeliveryDestination destination = DeliveryDestination.PINKAFELD;
        Delivery d = new Delivery();
        double deliveryCosts = d.getDeliveryCosts(destination);
        Assertions.assertEquals(10, deliveryCosts);
    }

    @Test
    public void testGetDeliveryTimeEisenstadt() {
        DeliveryDestination destination = DeliveryDestination.EISENSTADT;
        Delivery d = new Delivery();
        double deliveryTime = d.getDeliveryTime(destination);
        Assertions.assertEquals(200.0, deliveryTime);
    }

    @Test
    public void testGetDeliveryTimeVienna() {
        DeliveryDestination destination = DeliveryDestination.VIENNA;
        Delivery d = new Delivery();
        double deliveryTime = d.getDeliveryTime(destination);
        Assertions.assertEquals(400.0, deliveryTime);
    }

    @Test
    public void testGetDeliveryTimePinkafeld() {
        DeliveryDestination destination = DeliveryDestination.PINKAFELD;
        Delivery d = new Delivery();
        double deliveryTime = d.getDeliveryTime(destination);
        Assertions.assertEquals(1000.0, deliveryTime);
    }

}
