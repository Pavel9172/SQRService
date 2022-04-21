package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    SQRService service = new SQRService();

    @Test
    void calculte() {

        int min = 200;
        int max = 300;
        int expected = 3;
        int actual = service.calculateAmountSquare(min, max);
        assertEquals(expected, actual);


    }


}