import mate.Operacion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OperacionTest {
    @Test
    void testSuma() {
        Operacion op = new Operacion(10, 5);
        assertEquals(15, op.suma(), "10 + 5 debe ser 15");
    }

    @Test
    void testResta() {
        Operacion op = new Operacion(10, 5);
        assertEquals(5, op.resta(), "10 - 5 debe ser 5");
    }

    @Test
    void testMultiplicacion() {
        Operacion op = new Operacion(10, 5);
        assertEquals(50, op.multiplicacion(), "10 * 5 debe ser 50");
    }

    @Test
    void testDivision() {
        Operacion op = new Operacion(10, 5);
        assertEquals(2, op.division(), "10 / 5 debe ser 2");
    }
}