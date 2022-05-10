/**
 * @author Karina Medwenitsch
 * @since May 2022
 * This interface provides a create Hotdog method for the concrete factory to implement.
 */

package org.lecture.junkfood.hotdog;

public interface HotdogFactory {

    Hotdog createHotdog(int number);
}
