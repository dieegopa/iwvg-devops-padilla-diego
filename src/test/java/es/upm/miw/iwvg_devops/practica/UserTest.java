package es.upm.miw.iwvg_devops.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;

    @BeforeEach
    void before() {
        user = new User("1", "Diego", "Padilla");
    }

    @Test
    void testUserStringString() {
        assertEquals("1", user.getId());
        assertEquals("Diego", user.getName());
        assertEquals("Padilla", user.getFamilyName());
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

}
