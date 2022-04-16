package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    SQRService service = new SQRService();
    @Test
    void calculte(){
        int j = 0;
        int min = 200;
        int max = 300;
        long expected = 3;



        for (int i = 10; i <= 99; i++){
            if (i * i >= min && i * i <= max){

                System.out.println( "значения" +i);
                j++;










            }
        }
        System.out.println("итого"  +j  );
    }


}