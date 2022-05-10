/**
 * @author Karina Medwenitsch
 * @since May 2022
 * This class is to create a Pizza Margherita and to access its variables, when requested from the user.
 * Extends Pizza.
 */

package org.lecture.junkfood.pizza;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode

public class Margherita extends Pizza {

    int minutesToCreate = 7;
    int calories = 600;
    double price = 6;
    String name = "Pizza Margherita";

    /**
     * @return minutes it takes to create the junkfood
     */
    @Override
    public int getMinutesToCreate() {
        return minutesToCreate;
    }

    /**
     * @return amount of calories of the junkfood
     */
    @Override
    public int getCalories() {
        return calories;
    }

    /**
     * @return price of the junkfood
     */
    @Override
    public double getPrice() {
        return price;
    }
}
