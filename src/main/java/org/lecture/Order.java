/**
 * @author: Karina Medwenitsch
 * @since: May 2022
 * This class is to create an order, add junkfood items to it and calculate their production time, costs and total delivery time.
 */
package org.lecture;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.lecture.junkfood.Junkfood;
import org.lecture.junkfood.burger.Burger;
import org.lecture.junkfood.burger.BurgerFactory;
import org.lecture.junkfood.burger.ConcreteBurgerFactory;
import org.lecture.junkfood.hotdog.ConcreteHotdogFactory;
import org.lecture.junkfood.hotdog.Hotdog;
import org.lecture.junkfood.hotdog.HotdogFactory;
import org.lecture.junkfood.pizza.ConcretePizzaFactory;
import org.lecture.junkfood.pizza.Pizza;
import org.lecture.junkfood.pizza.PizzaFactory;

import java.util.List;
import java.util.Scanner;

@Getter
@Setter
@EqualsAndHashCode
@Slf4j

public class Order {

    static Scanner scanner = new Scanner(System.in);
    private List<Junkfood> junkfoodItems = new ArrayList();
    private double orderCosts;
    private DeliveryDestination destination;
    int minutesOfProduction;
    private long totalDeliveryTime;

    /**
     * constructor
     */
    public Order() {
    }

    /**
     * lets user add junkfood items to their order
     */
    public void choseItems() {
        System.out.println(showMenu());
        int number = scanner.nextInt();
        switch (number) {
            case 1, 2, 3 -> {
                BurgerFactory bf = new ConcreteBurgerFactory();
                Burger burger = bf.createBurger(number);
                junkfoodItems.add(burger);
                orderCosts += burger.getPrice();
            }
            case 4, 5, 6 -> {
                PizzaFactory pf = new ConcretePizzaFactory();
                Pizza pizza = pf.createPizza(number);
                junkfoodItems.add(pizza);
                orderCosts += pizza.getPrice();
            }
            case 7, 8 -> {
                HotdogFactory hf = new ConcreteHotdogFactory();
                Hotdog hotdog = hf.createHotdog(number);
                junkfoodItems.add(hotdog);
                orderCosts += hotdog.getPrice();
            }
            default -> {
                log.error("Invalid input error!");
                System.exit(1);
            }
        }
    }

    /**
     * shows menu
     * @return String with menu
     */
    private String showMenu() {
        return """
                ******************************
                               
                What would you like to order today?
                Type in the number of the desired product.
                    
                Burgers:
                1 - Cheeseburger
                2 - Hamburger
                3 - Baconburger
                               
                Pizzas:
                4 - Margherita
                5 - Salami
                6 - Cardinale
                               
                Hotdogs:
                7 - Classic Dog
                8 - Chili Dog 
                               
                ******************************""";
    }

    /**
     * prints order summary incl. ordered items, costs, production and delivery time
     */
    public void printOrderSummary() {
        Delivery d = new Delivery();
        System.out.println("""
                ******************************
                Your ordered items:
                ******************************""");
        for (Junkfood junkfood : junkfoodItems) {
            System.out.println(junkfood.getName() + ", " + junkfood.getPrice() + " EUR, " + junkfood.getCalories() + " calories, production time: " + junkfood.getMinutesToCreate() + " minutes");
        }
        System.out.println("******************************");
        System.out.println("Your subtotal is: " + orderCosts + " EUR");
        System.out.println("Total production time is : " + getProductionTime() + " milliseconds.");
        System.out.println("Delivery to " + destination.name() + " is " + d.getDeliveryCosts(destination) + " EUR and takes additional " + d.getDeliveryTime(destination) + " milliseconds.");
    }

    /**
     * calculates total production time of all ordered junkfood items
     * @return production time in milliseconds
     */
    public long getProductionTime() {
        LocalDateTime start = LocalDateTime.now();

        List productionTimesOfItems = new ArrayList();
        for (Junkfood junkfood : junkfoodItems) {
            double singleProductionTime = junkfood.getMinutesToCreate() * 0.25;
            productionTimesOfItems.add(singleProductionTime);
        }
        double maximum = (double) Collections.max(productionTimesOfItems);
        int frequency = Collections.frequency(productionTimesOfItems, Collections.max(productionTimesOfItems));

        int minutes = (int) (maximum * frequency);
        int seconds = (int) ((maximum * frequency - minutes) * 60);

        LocalDateTime end = start.plusMinutes(minutes).plusSeconds(seconds);
        return ChronoUnit.MILLIS.between(start, end);

    }

    /**
     * asks user to confirm their order and prints out total costs and delivery time
     * @return if user wants to confirm or not
     */
    public boolean isConfirmOrder() {
        boolean confirmOrder;
        Delivery d = new Delivery();
        System.out.println("******************************");
        System.out.println("Your total incl. delivery costs: " + (orderCosts + d.getDeliveryCosts(destination)) + " EUR");
        getTotalDeliveryTime();
        System.out.println("Total delivery time: " + totalDeliveryTime + " milliseconds");
        System.out.println("******************************");
        System.out.println("Confirm order? y/n");
        confirmOrder = scanner.nextLine().equalsIgnoreCase("y");
        return confirmOrder;
    }

    /**
     * calculates total delivery time (production time, delivery time and 2 seconds after placing the order)
     * @return total delivery time in milliseconds
     */
    public long getTotalDeliveryTime() {
        Delivery d = new Delivery();
        return totalDeliveryTime = (long) (getProductionTime() + d.getDeliveryTime(getDestination()) + 2000);
    }


}
