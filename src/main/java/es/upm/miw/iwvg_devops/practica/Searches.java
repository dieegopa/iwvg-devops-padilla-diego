package es.upm.miw.iwvg_devops.practica;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Searches {

    public Fraction findFractionDivisionByUserId(String id) {
        return new UsersDatabase().findAll()
                .filter(user -> id.equals(user.getId()))
                .flatMap(user -> user.getFractions().stream()
                        .filter(Objects::nonNull)
                )
                .reduce(new Fraction(1, 1), Fraction::divide);
    }

    public Stream<String> findUserFamilyNameInitialBySomeProperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions()
                        .stream()
                        .anyMatch(Fraction::isProper)
                )
                .map(User::familyNameInitial);
    }
}
