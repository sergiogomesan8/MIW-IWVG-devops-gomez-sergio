package es.upm.miw.iwvg_devops.code;

import java.util.stream.Stream;

public class Searches {

    public Stream<String> findUserFamilyNameBySomeImproperFraction() {
        return new UsersDatabase().findAll().filter(
                user -> user.getFractions().stream()
                        .anyMatch(Fraction::isImproper)
        ).map(User::getFamilyName);
    }

    public Fraction findFractionSubtractionByUserName(String name) {
        return new UsersDatabase().findAll().filter(user -> user.getName().equals(name))
                .flatMap(user -> user.getFractions().stream())
                .reduce(Fraction::subtract).orElse(new Fraction(0, 0));
    }
}