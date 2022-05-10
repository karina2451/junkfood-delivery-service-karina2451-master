/**
 * @author Karina Medwenitsch
 * @since May 2022
 * This class is to test the createBurger() method and to check if the right type of Burger is created.
 * Also it tests if the inheritance hierarchy is correct.
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.lecture.junkfood.Junkfood;
import org.lecture.junkfood.burger.*;

public class TestConcreteBurgerFactory {

    @Test
    public void testCreateCheeseburger() {
        ConcreteBurgerFactory cbf = new ConcreteBurgerFactory();
        int number = 1;
        Assertions.assertTrue(cbf.createBurger(number) instanceof Cheeseburger);
    }

    @Test
    public void testCreateBaconburger() {
        ConcreteBurgerFactory cbf = new ConcreteBurgerFactory();
        int number = 3;
        Assertions.assertTrue(cbf.createBurger(number) instanceof Baconburger);
    }

    @Test
    public void testCreateHamburger() {
        ConcreteBurgerFactory cbf = new ConcreteBurgerFactory();
        int number = 2;
        Assertions.assertTrue(cbf.createBurger(number) instanceof Hamburger);
    }

    @Test
    public void testHamburgerInstanceOfBurger() {
        ConcreteBurgerFactory cbf = new ConcreteBurgerFactory();
        int number = 2;
        Assertions.assertTrue(cbf.createBurger(number) instanceof Burger);
    }

    @Test
    public void testHamburgerInstanceOfJunkfood() {
        ConcreteBurgerFactory cbf = new ConcreteBurgerFactory();
        int number = 2;
        Assertions.assertTrue(cbf.createBurger(number) instanceof Junkfood);
    }
}
