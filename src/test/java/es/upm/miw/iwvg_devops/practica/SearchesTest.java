package es.upm.miw.iwvg_devops.practica;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchesTest {

    @Test
    void testFindFractionDivisionByUserId() {
        assertEquals(8, new Searches().findFractionDivisionByUserId("4").getNumerator());
        assertEquals(8, new Searches().findFractionDivisionByUserId("4").getDenominator());
        assertEquals(1, new Searches().findFractionDivisionByUserId("4").decimal());
        assertEquals(Fraction.class, new Searches().findFractionDivisionByUserId("4").getClass());
    }

    @Test
    void testFindUserFamilyNameInitialBySomeProperFraction() {
        assertEquals(List.of("F", "B", "L", "B"), new Searches().findUserFamilyNameInitialBySomeProperFraction()
                .collect(Collectors.toList()));
    }

    @Test
    void testFindFirstDecimalFractionByUserName() {
        assertEquals(-0.20, new Searches().findFirstDecimalFractionByUserName("Ana"));
    }

    @Test
    void testFindDecimalImproperFractionByUserName() {
        assertEquals(List.of(2.00, -0.5), new Searches().findDecimalImproperFractionByUserName("Oscar")
                .collect(Collectors.toList()));
    }

}
