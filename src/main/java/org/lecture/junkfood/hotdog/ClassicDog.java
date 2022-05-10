/**
 * @author Karina Medwenitsch
 * @since May 2022
 * This class is to create a Classic Hotdog, when requested from the user.
 * Extends Hotdog.
 */

package org.lecture.junkfood.hotdog;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode

public class ClassicDog extends Hotdog {

    int minutesToCreate = 3;
    int calories = 300;
    double price = 3;
    String name = "Classic Dog";

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
