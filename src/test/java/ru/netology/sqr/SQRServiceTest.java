package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    SQRService service = new SQRService();

    @Test
    void calculteActual() {

        int min = 200;
        int max = 300;
        int expected = 3;
        int actual = service.calculateAmountSquare(min, max);
        assertEquals(expected, actual);


    }

    @Test
    void calculteMaximumNumber() {

        int min = 2;
        int max = 9000000;
        int expected = 90;
        int actual = service.calculateAmountSquare(min, max);
        assertEquals(expected, actual);


    }

    @Test
    void calculteMinimumNumber() {

        int min = 10;
        int max = 100;
        int expected = 1;
        int actual = service.calculateAmountSquare(min, max);
        assertEquals(expected, actual);


    }

    @Test
    void calculteNumberNotParameters() {

        int min = 1;
        int max = 50;
        int expected = 0;
        int actual = service.calculateAmountSquare(min, max);
        assertEquals(expected, actual);


    }


}