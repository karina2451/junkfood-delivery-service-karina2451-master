/**
 * @author Karina Medwenitsch
 * @since May 2022
 * This class is to test the createHotdog() method and to check if the right type of Hotdog is created.
 * Also it tests if the inheritance hierarchy is correct.
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.lecture.junkfood.Junkfood;
import org.lecture.junkfood.hotdog.ChiliDog;
import org.lecture.junkfood.hotdog.ClassicDog;
import org.lecture.junkfood.hotdog.ConcreteHotdogFactory;
import org.lecture.junkfood.hotdog.Hotdog;

public class TestConcreteHotdogFactory {

    @Test
    public void testCreateClassicDog() {
        ConcreteHotdogFactory chf = new ConcreteHotdogFactory();
        int number = 7;
        Assertions.assertTrue(chf.createHotdog(number) instanceof ClassicDog);
    }

    @Test
    public void testCreateChiliDog() {
        ConcreteHotdogFactory chf = new ConcreteHotdogFactory();
        int number = 8;
        Assertions.assertTrue(chf.createHotdog(number) instanceof ChiliDog);
    }

    @Test
    public void testChiliDogInstanceOfHotdog() {
        ConcreteHotdogFactory chf = new ConcreteHotdogFactory();
        int number = 8;
        Assertions.assertTrue(chf.createHotdog(number) instanceof Hotdog);
    }

    @Test
    public void testChiliDogInstanceOfJunkfood() {
        ConcreteHotdogFactory chf = new ConcreteHotdogFactory();
        int number = 8;
        Assertions.assertTrue(chf.createHotdog(number) instanceof Junkfood);
    }
}
