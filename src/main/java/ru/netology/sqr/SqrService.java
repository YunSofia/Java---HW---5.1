package ru.netology.sqr;

public class SqrService {
    public int sqrCalc(int j, int y) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i > j && i * i < y) {
                count++;
            }
        }
        return count;
    }
}
