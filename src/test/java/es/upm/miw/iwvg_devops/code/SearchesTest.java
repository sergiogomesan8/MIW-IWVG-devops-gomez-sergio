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

}