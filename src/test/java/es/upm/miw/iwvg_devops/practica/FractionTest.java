package es.upm.miw.iwvg_devops.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FractionTest {

    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction();
    }

    @Test
    void testFractionCreate() {
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
        assertEquals(Fraction.class, fraction.getClass());
    }

    @Test
    void testFractionCreateParams() {
        fraction = new Fraction(4, 10);
        assertEquals(4, fraction.getNumerator());
        assertEquals(10, fraction.getDenominator());
        assertEquals(Fraction.class, fraction.getClass());
    }

    @Test
    void testDecimal() {
        assertEquals(1, fraction.decimal());
    }

    @Test
    void testAdd() {
        fraction.setDenominator(4);
        assertEquals(0.5, fraction.add(new Fraction(1, 4)).decimal());
    }

    @Test
    void testMultiply() {
        fraction.setDenominator(2);
        assertEquals(1, fraction.multiply(new Fraction(2, 1)).decimal());
    }

    @Test
    void testDivide() {
        fraction.setDenominator(2);
        assertEquals(1, fraction.divide(new Fraction(1, 2)).decimal());
    }


}
