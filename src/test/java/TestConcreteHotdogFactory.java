/**
 * @author Karina Medwenitsch
 * @since May 2022
 * This class is to test the createHotdog() method and to check if the right type of Hotdog is created.
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.lecture.junkfood.hotdog.ChiliDog;
import org.lecture.junkfood.hotdog.ClassicDog;
import org.lecture.junkfood.hotdog.ConcreteHotdogFactory;

public class TestConcreteHotdogFactory {

    @Test
    public void createClassicDog() {
        ConcreteHotdogFactory chf = new ConcreteHotdogFactory();
        int number = 7;
        Assertions.assertTrue(chf.createHotdog(number) instanceof ClassicDog);
    }

    @Test
    public void createChiliDog() {
        ConcreteHotdogFactory chf = new ConcreteHotdogFactory();
        int number = 8;
        Assertions.assertTrue(chf.createHotdog(number) instanceof ChiliDog);
    }
}
