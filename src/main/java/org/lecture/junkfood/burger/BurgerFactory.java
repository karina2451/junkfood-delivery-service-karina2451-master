/**
 * @author Karina Medwenitsch
 * @since May 2022
 * This interface provides a create Burger method for the concrete factory to implement.
 */

package org.lecture.junkfood.burger;

public interface BurgerFactory {

    Burger createBurger(int number);

}
