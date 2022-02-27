package ru.netology.sqr;

public class SqrService {
    public int sqrCalc(int i) {
        int count = 0;
        for (i = 10; i <= 99; i++) {
            if (i * i > 200 && i * i < 300) {
                count++;
            }
        }
        return count++;
    }
}