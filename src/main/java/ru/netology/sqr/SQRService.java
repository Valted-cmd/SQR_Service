package ru.netology.sqr;

public class SQRService {

    public int sqrCount(int min, int max, int start, int end) {
        int count = 0;
        for (int i = min; i <= max; i++) {
                if (i * i >= start & i * i <= end) {
                    count++;
                }
        }
        return count;
    }
}
