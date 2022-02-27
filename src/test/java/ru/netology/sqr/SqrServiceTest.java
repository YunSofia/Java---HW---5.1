package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrServiceTest {

    @Test
    public void shouldsqrcalc() {
        SqrService service = new SqrService();
        int expected = 3;
        int actual = service.sqrCalc(225);
        Assertions.assertEquals(expected, actual);
    }
}


