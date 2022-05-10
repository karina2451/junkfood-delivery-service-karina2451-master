/**
 * @author Karina Medwenitsch
 * @since May 2022
 * This class is to test the calculation of the production time of orders.
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.lecture.Delivery;
import org.lecture.DeliveryDestination;
import org.lecture.Order;
import org.lecture.junkfood.burger.Baconburger;
import org.lecture.junkfood.burger.Cheeseburger;
import org.lecture.junkfood.burger.Hamburger;
import org.lecture.junkfood.hotdog.ChiliDog;
import org.lecture.junkfood.hotdog.ClassicDog;
import org.lecture.junkfood.pizza.Margherita;
import org.lecture.junkfood.pizza.Salami;

import java.util.ArrayList;
import java.util.List;

public class TestOrder {

    @Test
    public void testGetProductionTimeWithCheeseburgerAndBaconburger() {
        Order order = new Order();
        List testJunkfoodItems = new ArrayList();
        testJunkfoodItems.add(new Cheeseburger());
        testJunkfoodItems.add(new Baconburger());
        order.setJunkfoodItems(testJunkfoodItems);
        Assertions.assertEquals(150000, order.getProductionTime());
    }

    @Test
    public void testGetProductionTimeWithClassicDogAndMargherita() {
        Order order = new Order();
        List testJunkfoodItems = new ArrayList();
        testJunkfoodItems.add(new Margherita());
        testJunkfoodItems.add(new ClassicDog());
        order.setJunkfoodItems(testJunkfoodItems);
        Assertions.assertEquals(105000, order.getProductionTime());
    }

    @Test
    public void testGetProductionTimeWithChiliDogAndSalamiAndHamburger() {
        Order order = new Order();
        List testJunkfoodItems = new ArrayList();
        testJunkfoodItems.add(new Hamburger());
        testJunkfoodItems.add(new ChiliDog());
        testJunkfoodItems.add(new Salami());
        order.setJunkfoodItems(testJunkfoodItems);
        Assertions.assertEquals(105000, order.getProductionTime());
    }


}
