
package ru.netology.sqr.CountOfSquares.services;

public class SQRService {
    public int calcSquare(int lowerLimit, int upperLimit) {
        int numberSQR = 0;
        for (int i = 10; i <= 99; i++) {
            if (lowerLimit <= i * i && i * i <= upperLimit) {
                //System.out.print("i= " + i + ", i^2 = " + i * i + "\n");
                numberSQR++;
            }
        }
        return numberSQR;
    }
}
