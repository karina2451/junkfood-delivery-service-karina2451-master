/**
 * @author Karina Medwenitsch
 * @since May 2022
 * This class provides the concrete hotdog factory with the respective method to create a hotdog.
 * Implements HotdogFactory.
 */

package org.lecture.junkfood.hotdog;

public class ConcreteHotdogFactory implements HotdogFactory {

    /**
     * creates Hotdog according to the user's choice
     * @param number the user inputs to define which kind of hotdog they want
     * @return Hotdog of type the user wants
     */
    @Override
    public Hotdog createHotdog(int number) {
        Hotdog hotdog = null;
        if (number == 7) {
            hotdog = new ClassicDog();
        } else if (number == 8) {
            hotdog = new ChiliDog();
        } return hotdog;
    }
}
