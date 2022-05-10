/**
 * @author: Karina Medwenitsch
 * @since: May 2022
 * This program is a fast junkfood delivery service. It lets users create an order with several junkfood items and simulates the delivery.
 * This class is to start the ordering process.
 */

package org.lecture;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j

public class JunkfoodDeliveryDriver {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        welcomeScreen();
    }

    /**
     * welcome screen, lets user decide whether to place an order or not
     */
    private static void welcomeScreen() {
        System.out.println("""
                ******************************
                Welcome to FastDelivery!
                What would you like to do?
                1 - Create new order
                2 - Exit
                ******************************""");
        int option = scanner.nextInt();
        switch (option) {
            case 1 -> createNewOrder();
            case 2 -> {
                System.out.println("See you next time! Bye bye!");
                System.exit(-1);
            }
        }
    }

    /**
     * creates a new order according to the user's wishes
     */
    private static void createNewOrder() {
        Order order = new Order();
        Delivery delivery = new Delivery();
        while (true) {
            order.choseItems();
            System.out.println("Do you want to order another item? (y/n)");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("y")) {
                break;
            }
        }
        delivery.pickDestination(order);
        getNextOption(order);
    }

    /**
     * provides possible options for the user to chose from after chosing junkfood items and delivery destination
     * user can print their order summary, confirm or cancel the order
     * @param order the user just placed
     */
    private static void getNextOption(Order order) {
        Delivery d = new Delivery();
        System.out.println("""
                ******************************
                What would you like to do now?
                1 - Show order summary
                2 - Confirm order
                3 - Cancel order
                ******************************""");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                order.printOrderSummary();
                getNextOption(order);
                break;
            case 2:
                System.out.println("Ok, preparing your order...");
                if (order.isConfirmOrder()) {
                    try {
                        d.deliver(order);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    getNextOption(order);
                }
                welcomeScreen();
            case 3:
                System.out.println("Ok, cancelling order...");
                welcomeScreen();
                break;

        }
    }


}
