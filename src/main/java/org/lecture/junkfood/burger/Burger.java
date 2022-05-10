/**
 * @author Karina Medwenitsch
 * @since May 2022
 * This abstract class serves as a base for all other Burger Classes.
 * Extends Junkfood.
 */

package org.lecture.junkfood.burger;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.lecture.junkfood.Junkfood;

@Getter
@EqualsAndHashCode

public abstract class Burger extends Junkfood {

    int minutesToCreate;
    int calories;
    double price;
    String name;

}



