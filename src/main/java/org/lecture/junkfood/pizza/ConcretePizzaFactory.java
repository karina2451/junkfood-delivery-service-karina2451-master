/**
 * @author Karina Medwenitsch
 * @since May 2022
 * This class provides the concrete pizza factory with the respective method to create a pizza.
 * Implements PizzaFactory.
 */

package org.lecture.junkfood.pizza;

public class ConcretePizzaFactory implements PizzaFactory {

    /**
     * creates Pizza according to the user's choice
     * @param number the user inputs to define which kind of pizza they want
     * @return Pizza of type the user wants
     */
    @Override
    public Pizza createPizza(int number) {
        Pizza pizza = null;
        if (number == 4) {
            pizza = new Margherita();
        } else if (number == 5) {
            pizza = new Salami();
        } else if (number == 6) {
            pizza = new Cardinale();
        } return pizza;
    }
}
