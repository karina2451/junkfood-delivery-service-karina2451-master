/**
 * @author Karina Medwenitsch
 * @since 2022
 * This abstract class serves as a base for all other junkfoods.
 */

package org.lecture.junkfood;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode

public abstract class Junkfood {

    int minutesToCreate;
    int calories;
    double price;
    String name;
}


