/**
 * @author Karina Medwenitsch
 * @since May 2022
 * This abstract class serves as a base for all other Pizza classes.
 * Extends Junkfood.
 */

package org.lecture.junkfood.pizza;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.lecture.junkfood.Junkfood;

@Getter
@EqualsAndHashCode

public abstract class Pizza extends Junkfood {

    int minutesToCreate;
    int calories;
    double price;
    String name;
}
