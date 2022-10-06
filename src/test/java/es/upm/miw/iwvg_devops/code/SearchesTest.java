package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SearchesTest {

    @Test
    void testFindUserFamilyNameBySomeImproperFraction() {
        assertEquals(List.of("Fernandez", "Blanco", "López", "Torres", "Blanco", "Torres"),
                new Searches().findUserFamilyNameBySomeImproperFraction().collect(Collectors.toList()));
    }

    @Test
    void testFindFractionSubtractionByUserName() {
        assertEquals(22, new Searches().findFractionSubtractionByUserName("Ana").getNumerator());
        assertEquals(60, new Searches().findFractionSubtractionByUserName("Ana").getDenominator());
    }

    @Test
    void testFindFirstDecimalFractionByUserName() {
        assertEquals(0, new Searches().findFirstDecimalFractionByUserName("Antonio"));
        assertEquals(2, new Searches().findFirstDecimalFractionByUserName("Ana"));
    }

    @Test
    void testFindUserNameBySomeImproperFraction() {
        assertEquals(List.of("Oscar", "Ana", "Oscar", "Paula", "Antonio", "Paula"), new Searches().findUserNameBySomeImproperFraction()
                .collect(Collectors.toList()));
    }

}