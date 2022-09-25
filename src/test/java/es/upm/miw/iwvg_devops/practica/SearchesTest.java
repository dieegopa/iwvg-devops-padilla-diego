package es.upm.miw.iwvg_devops.practica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchesTest {

    @Test
    void testFindFractionDivisionByUserId() {
        assertEquals(8, new Searches().findFractionDivisionByUserId("4").getNumerator());
        assertEquals(8, new Searches().findFractionDivisionByUserId("4").getDenominator());
        assertEquals(1, new Searches().findFractionDivisionByUserId("4").decimal());
        assertEquals(Fraction.class, new Searches().findFractionDivisionByUserId("4").getClass());
    }

}
