/**
 * @author Karina Medwenitsch
 * @since May 2022
 * This interface provides a create Pizza method for the concrete factory to implement.
 */

package org.lecture.junkfood.pizza;

public interface PizzaFactory {

    Pizza createPizza(int number);
}
