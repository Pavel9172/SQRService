package ru.netology.sqr;

public class SQRService {
    public static void main(String[] args) {

        int j = 0;
        int min = 200;
        int max = 300;


        for (int i = 10; i <= 99; i++){
            if (i * i >= min && i * i <= max){

                System.out.println( "значения" +i);
                j++;










            }
        }
        System.out.println("итого"  +j  );
    }

}