/**
 * @author Karina Medwenitsch
 * @since May 2022
 * This class is to create a Baconburger, when requested from the user.
 * Extends Burger.
 */

package org.lecture.junkfood.burger;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode

public class Baconburger extends Burger {

    int minutesToCreate = 5;
    int calories = 500;
    double price = 5;
    String name = "Baconburger";

    /**
     * @return price of the junkfood
     */
    @Override
    public double getPrice() {
        return price;
    }

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
}
