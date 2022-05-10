/**
 * @author Karina Medwenitsch
 * @since May 2022
 * This class provides the concrete burger factory with the respective method to create a burger.
 * Implements BurgerFactory.
 */

package org.lecture.junkfood.burger;

public class ConcreteBurgerFactory implements BurgerFactory {

    /**
     * creates Burger according to the user's choice
     * @param number the user inputs to define which kind of burger they want
     * @return Burger of type the user wants
     */
    public Burger createBurger(int number) {
        Burger burger = null;
        if (number == 1) {
            burger = new Cheeseburger();
        } else if (number == 2) {
            burger = new Hamburger();
        } else if (number == 3) {
            burger = new Baconburger();
        } return burger;
    }
}
