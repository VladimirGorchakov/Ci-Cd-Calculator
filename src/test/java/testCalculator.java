import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testCalculator {
    Calculator calc = new Calculator();

    @Test
    void additional(){
        assertEquals(2, calc.add(1,1));
    }
    @Test
    void minus(){
        assertEquals(0, calc.minus(1,1));
    }
    @Test
    void difference(){
        assertEquals(1, calc.diff(1,1));
    }
    @Test
    void multiply(){
        assertEquals(1, calc.multi(1,1));
    }
}
