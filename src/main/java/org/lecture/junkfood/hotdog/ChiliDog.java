/**
 * @author Karina Medwenitsch
 * @since May 2022
 * This class is to create a Chili Dog, when requested from the user.
 * Extends Hotdog.
 */

package org.lecture.junkfood.hotdog;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode

public class ChiliDog extends Hotdog {

    int minutesToCreate = 3;
    int calories = 350;
    double price = 3.5;
    String name = "Chili Dog";

    /**
     * @return minutes it takes to create the junkfood
     */
    public int getMinutesToCreate() {
        return minutesToCreate;
    }

    /**
     * @return amount of calories of the junkfood
     */
    public int getCalories() {
        return calories;
    }

    /**
     * @return price of the junkfood
     */
    public double getPrice() {
        return price;
    }
}
