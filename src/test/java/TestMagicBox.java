import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.netology.MagicBox;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMagicBox {
    @org.junit.jupiter.api.Test
    @DisplayName("проверяю длину созданного массива")
    public void testLengthItems(){
        final MagicBox<Integer> numb = new MagicBox<>(3);
        final int expected = 3;
        Assertions.assertEquals(expected, numb.getSize());
    }

    @org.junit.jupiter.api.Test
    @DisplayName("проверяю метод add")
    public void testAdd(){
        final MagicBox<Integer> numb = new MagicBox<>(1);
        numb.add(5);
        final int expected = 5;
        Assertions.assertEquals(expected, numb.pick());
    }

    @org.junit.jupiter.api.Test
    @DisplayName("проверяю тип объектов в созданном классе")
    public void testObjectsType(){
        final MagicBox<Integer> numb = new MagicBox<>(1);
        numb.add(5);
        final Class numbClass = numb.getClass();
        final String expected = "class java.lang.Integer";
        Assertions.assertEquals(expected, numb.pick().getClass().toString());
    }
}

