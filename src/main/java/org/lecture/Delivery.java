/**
 * @author: Karina Medwenitsch
 * @since: May 2022
 * This class lets users pick a delivery destination, calculates the delivery costs and time and delivers the order
 */

package org.lecture;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

@Getter
@EqualsAndHashCode

public class Delivery {

    static Scanner scanner = new Scanner(System.in);
    private double deliveryCosts;
    private double deliveryTime;

    /**
     * lets user pick the destination the food shall be delivered to
     * @param order - the order the user wants to pick the delivery destination for
     */
    public void pickDestination(Order order) {
        while (order.getDestination() == null) {
            System.out.println("""
                    ******************************
                    Where do you want your order to be delivered to?
                    Type in the number of your desired delivery destination.
                    1 - Eisenstadt
                    2 - Vienna
                    3 - Pinkafeld
                    ******************************""");
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> order.setDestination(DeliveryDestination.EISENSTADT);
                case 2 -> order.setDestination(DeliveryDestination.VIENNA);
                case 3 -> order.setDestination(DeliveryDestination.PINKAFELD);
                default -> System.out.println("Invalid input. Please try again.");
            }
        }
    }

    /**
     * calculates delivery costs based on kilometers
     * @param destination the food shall be delivered to
     * @return delivery costs
     */
    public double getDeliveryCosts(DeliveryDestination destination) {
        return deliveryCosts = destination.getKilometers() * 0.1;
    }

    /**
     * calculates delivery time to a specific destination
     * @param destination the food shall be delivered to
     * @return delivery time in milliseconds
     */
    public double getDeliveryTime(DeliveryDestination destination) {
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plus(destination.getKilometers() * 10, ChronoField.MILLI_OF_DAY.getBaseUnit());
        return deliveryTime = ChronoUnit.MILLIS.between(start, end);
    }

    /**
     * delivers food, total delivery time simulated with sleep()
     * @param order that shall be delivered
     * @throws InterruptedException
     */
    void deliver(Order order) throws InterruptedException {
        System.out.println("Thank you for your order!");
        System.out.println("Delivering...");
        System.out.println("...");
        TimeUnit.MILLISECONDS.sleep(order.getTotalDeliveryTime());
        System.out.println("Ding Dong! Your order has arrived!");
    }
}
