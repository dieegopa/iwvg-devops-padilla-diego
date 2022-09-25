package es.upm.miw.iwvg_devops.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;
    private List<Fraction> fractions;

    @BeforeEach
    void before() {
        fractions = new ArrayList<>();
        user = new User("1", "Diego", "Padilla", fractions);
    }

    @Test
    void testUserCreate() {
        assertEquals("1", user.getId());
        assertEquals("Diego", user.getName());
        assertEquals("Padilla", user.getFamilyName());
        assertEquals(fractions, user.getFractions());
        assertEquals(User.class, user.getClass());
    }

    @Test
    void testFullName() {
        assertEquals("Diego Padilla", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("D.", user.initials());
    }

    @Test
    void testAddFraction(){
        user.addFraction(new Fraction(1, 1));
        assertEquals(1, user.getFractions().size());
    }

}
